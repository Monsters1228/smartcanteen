package com.zsc.equipment.utils;

import UHF.UHFReader;
import com.zsc.equipment.service.EquipClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

@Component
public class RFIDReader {
    private static final Logger log = LoggerFactory.getLogger(RFIDReader.class);
    String equipName = "equip1";
    @Autowired
    private EquipClient equipClient;

    private int fCmdRet = 0x30;
    UHFReader uhf = new UHFReader();

    @PostConstruct
    @Async
    public void OpenCom() {
        byte ComAddr = (byte) 255;
        byte baudRate = (byte) 5;
        fCmdRet = uhf.AutoOpenCom(ComAddr, baudRate);
        if (fCmdRet == 0) {
            log.info("打开串口成功");
            query();
        } else {
            log.info("打开串口失败");
        }
    }

    @Async
    @Scheduled(cron = "0/1 * * * * *")
    public List<String> query() {
        Set<String> set = new LinkedHashSet<>();
        List<String> list = new ArrayList<>();
        String EPC[] = uhf.Inventory();
        if (EPC == null) return null;

        for (String val : EPC) {
            list.add(val);
        }
        set.addAll(list);
        list.clear();
        list.addAll(set);
        equipClient.sendTag(list, equipName);
        return list;
    }
}
