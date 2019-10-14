package com.zhangxy.stream;

import java.util.Optional;

/**
 * 空校验
 *
 * @author zhangxy
 * @date 2019/10/10
 **/
public class OptionalApi {
    public static void main(String[] args) {
//        Person person=null;
        Person person=new Person("2",3,"men");
        person.setUser(new User("2",3,"men"));
        //isPresent()，相当于 ！=null
        System.out.println(Optional.ofNullable(person).orElseGet(()->{
            return new Person("1",2,"men");
        }));
        boolean present = Optional.ofNullable(person).map(Person::getUser)
                .map(User::getSex)
                .isPresent();
        System.out.println(present);
    }
}
