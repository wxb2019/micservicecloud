package com.wangxb.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author wangpd
 * @version 1.0
 * @date 2019-09-06 17:13
 **/
@SpringBootApplication
@EnableEurekaServer
public class Eureka_Config_Client_StartupApp {
    public static void main(String[] args) {
        SpringApplication.run(Eureka_Config_Client_StartupApp.class, args);
    }
}
