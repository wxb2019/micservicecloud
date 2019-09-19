package com.wangxb.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
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
    //一旦调用服务方法失败并抛出了错误信息，会自动调用@HystrixCommand标注好的fallbackMethod调用类中指定的方法
    @HystrixCommand(fallbackMethod = "processHystrix_Get")
    public Dept get(@PathVariable("id") Long id) {
        Dept dept = deptService.findById(id);
        if (dept == null) {
            throw new RuntimeException("找不到对应的数据！");
        }
        return dept;
    }

    @RequestMapping(value = "/dept/list", method = RequestMethod.GET)
    public List<Dept> list() {
        return deptService.findAll();
    }

    public Dept processHystrix_Get(@PathVariable("id") Long id) {
        return new Dept().setDeptNo(id).setDeptName("该ID:"+id + "没有对应的信息，null -- @HystrixCommand")
                .setDbSource("no this data in database mysql");
    }
}
