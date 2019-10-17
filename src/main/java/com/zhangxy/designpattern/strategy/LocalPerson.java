package com.zhangxy.designpattern.strategy;

/**
 * 本地人校验规则
 * @author zhangxy
 * @date 2019/10/17
 **/
public class LocalPerson implements IStrategy {
    @Override
    public void check() {
        System.out.println("本地人校验身份证");
    }
}
