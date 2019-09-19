package com.wangxb.springcloud.controller;

import com.wangxb.springcloud.entity.Dept;
import com.wangxb.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author wangpd
 * @version 1.0
 * @date 2019-09-04 0:10
 **/
@RestController
public class DeptController_Consumer {

    @Autowired
    private DeptClientService service;

    @RequestMapping(value = "/consumer/dept/add", method = RequestMethod.POST)
    boolean add(@RequestBody Dept dept) {
        return this.service.add(dept);
    }

    @RequestMapping(value = "/consumer/dept/get/{id}", method = RequestMethod.GET)
    Dept get(@PathVariable("id") Long id) {
        return this.service.get(id);
    }

    @RequestMapping(value = "/consumer/dept/list", method = RequestMethod.GET)
    List<Dept> list() {
        return this.service.list();
    }
}
