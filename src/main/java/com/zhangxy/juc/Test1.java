package com.zhangxy.juc;

/**
 * @author zhangxy
 * @date 2019/10/15
 **/
public class Test1 {
    public static void main(String[] args) {
        System.out.println(tableSizeFor(5));
        System.out.println(tableSizeFor(17));
        System.out.println(tableSizeFor(17));
    }


    public static int tableSizeFor(int cap){
        int MAXIMUM_CAPACITY=1<<30;
        int n = cap - 1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        return (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
    }
}
