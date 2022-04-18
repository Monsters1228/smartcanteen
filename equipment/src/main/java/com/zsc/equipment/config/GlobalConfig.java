package com.zsc.equipment.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author gwite
 */
@Data
@Configuration
@ConfigurationProperties(prefix = "equipment")
public class GlobalConfig {

    /**
     *  设备名称
     */
    String name;
}
