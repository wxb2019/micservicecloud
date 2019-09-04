package com.wangxb.myroles;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author wangpd
 * @version 1.0
 * @date 2019-09-04 15:42
 **/
@Configuration
public class MyselfRule {
    @Bean
    public IRule MyselfRule() {
        return new MyRandomRule();
    }
}
