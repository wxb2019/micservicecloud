package com.wangxb.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author wangpd
 * @version 1.0
 * @date 2019-09-04 10:52
 **/
@SpringBootApplication
@EnableEurekaServer //Eureka Server 服务端启动类，接受其他微服务注册进来
public class EurekaServer7001_App {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7001_App.class, args);
    }
}
