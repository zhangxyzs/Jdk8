package com.zhangxy.algorithm;

/**
 * @author zhangxy
 * @date 2019/10/14
 **/
public class SelectSort extends  AbstractSort{

    @Override
    public void sort(int[] data) {
        for(int i=0;i<data.length;i++){
            int minIndex=i;
            for(int j=i+1;j<data.length;j++){
                if(data[j]<data[minIndex]){
                    minIndex=j;
                }
            }
            swap(data,i,minIndex);
        }
    }

    public static void main(String[] args) {
        SelectSort sort=new SelectSort();
        sort.test();
    }
}
