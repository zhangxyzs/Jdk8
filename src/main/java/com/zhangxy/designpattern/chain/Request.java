package com.zhangxy.designpattern.chain;

import lombok.Data;

/**
 * @author zhangxy
 * @date 2019/10/17
 **/
@Data
public class Request {
    private int level;
    private String request;
}
