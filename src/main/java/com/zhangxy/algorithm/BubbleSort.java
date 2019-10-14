package com.zhangxy.algorithm;

/**
 * 冒泡排序
 *
 * @author zhangxy
 * @date 2019/10/14
 **/
public class BubbleSort extends AbstractSort{
    @Override
    public void sort(int[] data) {
        for(int i=0;i<data.length;i++){
            for(int j=0;j<data.length-i-1;j++){
                if(data[j]>data[j+1]){
                    swap(data,j,j+1);
                }
            }
        }
    }

    public static void main(String[] args) {
        BubbleSort sort=new BubbleSort();
        sort.test();
    }
}
