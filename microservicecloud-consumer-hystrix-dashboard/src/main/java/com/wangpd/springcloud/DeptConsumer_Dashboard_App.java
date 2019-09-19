package com.wangpd.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * @author wangpd
 * @version 1.0
 * @date 2019-09-06 10:50
 **/
@SpringBootApplication
@EnableHystrixDashboard
@EnableTurbine
public class DeptConsumer_Dashboard_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer_Dashboard_App.class,args);
    }
}
