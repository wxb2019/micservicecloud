package com.wangxb.springcloud.configbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author wangpd
 * @version 1.0
 * @date 2019-09-04 0:06
 **/
@Configuration
public class ConfigBean {
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate () {
        return new RestTemplate();
    }
}
