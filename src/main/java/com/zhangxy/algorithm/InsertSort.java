package com.zhangxy.algorithm;

/**
 * @author zhangxy
 * @date 2019/10/14
 **/
public class InsertSort extends AbstractSort {
    @Override
    public void sort(int[] data) {
        for(int i=1;i<data.length;i++){
            for(int j=i;j>0;j--){
                if(data[j-1]>data[j]){
                    swap(data,j-1,j);
                }
            }
        }
    }

    public static void main(String[] args) {
        InsertSort sort=new InsertSort();
        sort.test();
    }
}
