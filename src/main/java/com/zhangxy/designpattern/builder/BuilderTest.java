package com.zhangxy.designpattern.builder;

/**
 * @author zhangxy
 * @date 2019/10/17
 **/
public class BuilderTest {
    public static void main(String[] args) {
        Director director=new Director();
        Robbit robbit = director.createRobbit(new DancerBuilder(new Robbit()));
        System.out.println(robbit);
    }
}
