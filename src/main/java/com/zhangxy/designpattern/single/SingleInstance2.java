package com.zhangxy.designpattern.single;

/**
 * double-check 双重
 * @author zhangxy
 * @date 2019/10/17
 **/
public class SingleInstance2 {
    private volatile static SingleInstance2 instance2;
    private SingleInstance2(){}

    public static SingleInstance2 getInstance2() {
        if(instance2==null){
            synchronized (SingleInstance2.class){
                if(instance2==null){
                    instance2=new SingleInstance2();
                }
            }
        }
        return instance2;
    }
}
