package com.wangxb.springcloud.service;

import com.wangxb.springcloud.entity.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author wangpd
 * @version 1.0
 * @date 2019-09-06 10:03
 **/
@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {
    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public boolean add(Dept dept) {
                return false;
            }

            @Override
            public Dept get(Long id) {
                return new Dept().setDeptNo(id).setDeptName("该服务已做降级处理，暂停使用！");
            }

            @Override
            public List<Dept> list() {
                return null;
            }
        };
    }
}
