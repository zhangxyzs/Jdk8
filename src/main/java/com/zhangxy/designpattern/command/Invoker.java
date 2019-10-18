package com.zhangxy.designpattern.command;

import lombok.Data;

/**
 * @author zhangxy
 * @date 2019/10/18
 **/
@Data
public class Invoker {
    private Command command;
    public void commandAction(){
        command.execute();
    }
}
