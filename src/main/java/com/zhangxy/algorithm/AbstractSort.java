package com.zhangxy.algorithm;

import java.util.Arrays;
import java.util.Random;

/**
 * 抽象排序
 *
 * @author zhangxy
 * @date 2019/10/14
 **/
public abstract class AbstractSort implements Sort {

    public void test() {
        //获取初始化的数组
        int[] ints = buildRandomArray(10);
        System.out.println("init Array");
        //打印初始化数组
        printArray(ints);
        int[] jdkCloneArray = Arrays.copyOf(ints, ints.length);
        Arrays.sort(jdkCloneArray);
        //打印JDK 排序数组
        System.out.println("Array JDK Sort");
        printArray(jdkCloneArray);
        int[] myCloneArray = Arrays.copyOf(ints, ints.length);
        System.out.println("Array my Sort");
        sort(myCloneArray);
        printArray(myCloneArray);

    }

    private int[] buildRandomArray(int size) {
        Random random = new Random();
        int[] initArray = new int[size];
        for (int i = 0; i < size; i++) {
            initArray[i] = random.nextInt(100);
        }
        return initArray;
    }

    private void printArray(int[] printArray) {
        for (int i = 0; i < printArray.length; i++) {
            System.out.print(printArray[i] + " ");
        }
        System.out.println();
    }

    protected void swap(int[] data, int src, int dest) {
        int temp = data[src];
        data[src] = data[dest];
        data[dest] = temp;
    }
}
