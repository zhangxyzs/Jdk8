package com.zhangxy.designpattern.command;

/**
 * @author zhangxy
 * @date 2019/10/18
 **/
public abstract class Command {
    RequirementGroup rg=new RequirementGroup();
    PageGroup pg=new PageGroup();
    CodeGroup cg=new CodeGroup();
    public abstract void execute();
}
