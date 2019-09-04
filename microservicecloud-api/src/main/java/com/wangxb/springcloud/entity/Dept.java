package com.wangxb.springcloud.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author wangpd
 * @version 1.0
 * @date 2019-08-31 0:32
 **/
@Data
@NoArgsConstructor
@Accessors(chain = true)
public class Dept implements Serializable {
    /** 部门编号，主键 */
    private Long deptNo;
    /** 来自哪一个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同的数据库 */
    private String dbSource;

    private String deptName;

    public Dept(String deptName) {
        this.deptName = deptName;
    }
}
