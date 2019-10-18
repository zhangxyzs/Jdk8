package com.zhangxy.designpattern.strategy;

import lombok.Data;

/**
 * @author zhangxy
 * @date 2019/10/18
 **/
@Data
public class Context {
    private IStrategy iStrategy;
    public void operate(){
        iStrategy.check();
    }
}
