package com.zsc.faceapi.app;

import com.arcsoft.face.FaceEngine;
import com.arcsoft.face.enums.ErrorInfo;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Monsters
 * @date 2022/4/14 5:48 下午
 */
@Slf4j
public class EngineInit {
    public static void main(String[] args) {
        String appId = "DyYDsnuujZeHZemQTy2P7DT3xmm5kV6QJYcLn8qL7mpY";
        String sdkKey = "38R8ENiRGhJD8NVcF3Xvn66V3FoyenfTh3efYEsDH7EX";

        FaceEngine faceEngineInit = new FaceEngine("D:\\WIN64");
        //激活引擎
        int activeCode = faceEngineInit.activeOnline(appId, sdkKey);
        log.info(String.valueOf(activeCode));
        if (activeCode != ErrorInfo.MOK.getValue()
                && activeCode != ErrorInfo.MERR_ASF_ALREADY_ACTIVATED.getValue()) {
            log.warn("引擎激活失败");
        } else {
            log.info("引擎激活成功");
        }
    }
}
