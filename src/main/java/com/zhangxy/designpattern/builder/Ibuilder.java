package com.zhangxy.designpattern.builder;

public interface Ibuilder {
    void builderHead();
    void builderHand();
    void builderBody();
    void builderFoot();
    Robbit createRobbit();

}
