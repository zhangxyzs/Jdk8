package com.zhangxy.designpattern.builder;

/**
 * 导演
 *
 * @author zhangxy
 * @date 2019/10/17
 **/
public class Director {
    public Robbit createRobbit(Ibuilder ibuilder){
        ibuilder.builderHead();
        ibuilder.builderHand();
        ibuilder.builderBody();
        ibuilder.builderFoot();
        return ibuilder.createRobbit();
    }
}
