package com.zhangxy.designpattern.single;

/**
 * 懒汉式，线程不安全
 * @author zhangxy
 * @date 2019/10/17
 **/
public class SingleInstance {
    private static SingleInstance instance;
    private SingleInstance(){}
    public static SingleInstance getInstance(){
        if(instance==null){
            instance=new SingleInstance();
        }
        return instance;
    }
}
