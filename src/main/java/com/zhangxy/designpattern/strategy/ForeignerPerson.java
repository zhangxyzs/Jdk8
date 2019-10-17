package com.zhangxy.designpattern.strategy;

/**
 * 外国人校验规则
 * @author zhangxy
 * @date 2019/10/17
 **/
public class ForeignerPerson implements IStrategy {
    @Override
    public void check() {
        System.out.println("外国人校验护照");
    }
}
