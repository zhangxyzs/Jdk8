package com.zhangxy.designpattern.observe;

import lombok.Data;

/**
 * 观察者天津
 * @author zhangxy
 * @date 2019/10/17
 **/
@Data
public class TianjinWeather implements Observer{
    private String name;
    private String address;

    public TianjinWeather(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public void notify(String msg) {
        System.out.println(name+"接收天气情况为："+msg);
    }
}
