package com.zhangxy.designpattern.command;

/**
 * @author zhangxy
 * @date 2019/10/18
 **/
public class PageCommand extends Command {
    @Override
    public void execute() {
        pg.find();
        pg.add();
        pg.delete();
    }
}
