package com.zhangxy.stream;

import lombok.Data;

/**
 * 1
 *
 * @author zhangxy
 * @date 2019/10/10
 **/
@Data
public class User {
    private String name;
    private Integer age;
    private String sex;

    public User() {
    }

    public User(String name, Integer age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
}
