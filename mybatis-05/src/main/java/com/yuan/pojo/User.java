package com.yuan.pojo;

import org.apache.ibatis.type.Alias;

/**
 * @author Yuan Liu
 * @create 2021-06-17 11:57 下午
 */
// 通过Alias注解取DIY的别名
@Alias("user")
public class User {



    private int id;
    private String name;
    private String password;

    public User() {

    }

    public User(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
