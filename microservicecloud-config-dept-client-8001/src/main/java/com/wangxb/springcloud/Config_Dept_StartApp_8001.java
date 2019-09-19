package com.wangxb.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author wangpd
 * @version 1.0
 * @date 2019-09-03 16:51
 **/
@SpringBootApplication
@EnableEurekaClient
public class Config_Dept_StartApp_8001 {
    public static void main(String[] args) {
        SpringApplication.run(Config_Dept_StartApp_8001.class, args);
    }
}
