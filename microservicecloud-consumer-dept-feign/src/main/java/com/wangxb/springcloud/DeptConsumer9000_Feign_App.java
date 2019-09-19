package com.wangxb.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author wangpd
 * @version 1.0
 * @date 2019-09-04 9:35
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"com.wangxb.springcloud"})
@ComponentScan("com.wangxb.springcloud")
public class DeptConsumer9000_Feign_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer9000_Feign_App.class, args);
    }
}
