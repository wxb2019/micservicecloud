package com.wangxb.springcloud;

import com.wangxb.myroles.MyselfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author wangpd
 * @version 1.0
 * @date 2019-09-04 9:35
 **/
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "MICROSERVICECLOUD-DEPT", configuration = MyselfRule.class)
public class DeptConsumer9000_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer9000_App.class, args);
    }
}
