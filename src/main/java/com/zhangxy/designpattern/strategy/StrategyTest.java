package com.zhangxy.designpattern.strategy;

/**
 * @author zhangxy
 * @date 2019/10/18
 **/
public class StrategyTest {
    public static void main(String[] args) {
        Context context=new Context();
        context.setIStrategy(new LocalPerson());
        context.operate();
    }
}
