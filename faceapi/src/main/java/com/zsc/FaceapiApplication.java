package com.zsc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class FaceapiApplication {

    public static void main(String[] args) {
        SpringApplication.run(FaceapiApplication.class, args);
    }

}
