package com.zhangxy.designpattern.command;

/**
 * @author zhangxy
 * @date 2019/10/18
 **/
public class CodeCommand extends Command {
    @Override
    public void execute() {
        cg.find();
        cg.add();
        cg.delete();
    }
}
