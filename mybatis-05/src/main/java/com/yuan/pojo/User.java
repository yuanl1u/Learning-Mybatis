package com.yuan.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.Alias;

/**
 * @author Yuan Liu
 * @create 2021-06-17 11:57 下午
 */
// Lombok 一个 data注解 实现get\set、无参构造、toString、hashcode、equals等常用法法
@Data
// 自动生成有参构造
@AllArgsConstructor
// 同时实现有参、无参构造
@NoArgsConstructor
public class User {

    private int id;
    private String name;
    private String password;
}
