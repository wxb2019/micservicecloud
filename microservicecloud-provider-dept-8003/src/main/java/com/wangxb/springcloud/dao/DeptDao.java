package com.wangxb.springcloud.dao;

import com.wangxb.springcloud.entity.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author wangpd
 * @version 1.0
 * @date 2019-09-02 16:49
 **/
@Mapper
public interface DeptDao {
    boolean addDept(Dept dept);

    Dept findById(Long id);

    List<Dept> findAll();
}
