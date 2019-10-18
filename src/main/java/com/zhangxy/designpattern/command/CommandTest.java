package com.zhangxy.designpattern.command;

/**
 * @author zhangxy
 * @date 2019/10/18
 **/
public class CommandTest {
    public static void main(String[] args) {
        Invoker invoker=new Invoker();
        invoker.setCommand(new PageCommand());
        invoker.commandAction();
    }

}
