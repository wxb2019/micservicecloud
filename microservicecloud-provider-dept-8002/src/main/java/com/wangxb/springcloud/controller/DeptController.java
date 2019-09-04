package com.wangxb.springcloud.controller;

import com.wangxb.springcloud.entity.Dept;
import com.wangxb.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author wangpd
 * @version 1.0
 * @date 2019-09-03 16:45
 **/
@RestController
public class DeptController {
    @Autowired
    private DeptService deptService;

    @RequestMapping(value = "/dept/add")
    public boolean add(@RequestBody Dept dept) {
        return deptService.addDept(dept);
    }

    @RequestMapping(value = "dept/get/{id}", method = RequestMethod.GET)
    public Dept get(@PathVariable("id") Long id) {
        return deptService.findById(id);
    }

    @RequestMapping(value = "/dept/list", method = RequestMethod.GET)
    public List<Dept> list() {
        return deptService.findAll();
    }
}
