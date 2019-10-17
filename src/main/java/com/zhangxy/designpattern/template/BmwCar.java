package com.zhangxy.designpattern.template;

/**
 * @author zhangxy
 * @date 2019/10/17
 **/
public class BmwCar extends AbstractTemplate {
    @Override
    protected void stop() {
        System.out.println("宝马汽车停止。。。");
    }

    @Override
    protected void fastRun() {
        System.out.println("宝马汽车加速。。。");
    }

    @Override
    protected void alerm() {
        System.out.println("宝马鸣笛。。。");
    }

    @Override
    protected void engineBoom() {
        System.out.println("宝马引擎启动。。。");
    }

    @Override
    protected void start() {
        System.out.println("宝马开始启动");
    }
}
