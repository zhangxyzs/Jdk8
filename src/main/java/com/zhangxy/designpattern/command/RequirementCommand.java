package com.zhangxy.designpattern.command;

/**
 * @author zhangxy
 * @date 2019/10/18
 **/
public class RequirementCommand extends Command {
    @Override
    public void execute() {
        rg.find();
        rg.add();
        rg.delete();
    }
}
