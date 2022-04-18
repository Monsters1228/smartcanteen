package com.zsc.equipment.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author Monsters
 * @date 2021/5/10
 * 向 server 发送标签信息
 */
@FeignClient(name = "SMARTFETETIA")
@Component
public interface EquipClient {
    @PostMapping("/api/test")
    void sendTag(List<String> Tags,@RequestParam("equipName")String equipName);
}
