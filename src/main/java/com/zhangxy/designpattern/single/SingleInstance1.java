package com.zhangxy.designpattern.single;



/** 懒汉式，线程安全
 * @author zhangxy
 * @date 2019/10/17
 **/
public class SingleInstance1 {
    private static SingleInstance1 instance;
    private SingleInstance1(){
    }
    public static synchronized SingleInstance1  getInstance(){
        if(instance==null){
            instance=new SingleInstance1();
        }
        return instance;
    }
}
