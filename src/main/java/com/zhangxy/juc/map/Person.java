package com.zhangxy.juc.map;

import com.zhangxy.stream.User;
import lombok.Data;

/**
 * 人员实体类
 *
 * @author zhangxy
 * @date 2019/10/10
 **/
@Data
public class Person {
    private String name;
    private Integer age;
    private String sex;
    private User user;
    public Person() {
    }

    public Person(String name, Integer age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;

    }
}
