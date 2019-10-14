package com.zhangxy.algorithm;

/**
 * @author zhangxy
 * @date 2019/10/14
 **/
public class MergeSort extends AbstractSort {
    @Override
    public void sort(int[] data) {
        sortHelper(0, data.length - 1, data);
    }

    private void sortHelper(int start, int end, int[] data) {
        if (start >= end) {
            return;
        }
        int median=start+(end-start)/2;
        sortHelper(start, median, data);
        sortHelper(median + 1, end, data);
        merge(start,median,median+1,end,data);
    }

    private void merge(int s1, int e1, int s2, int e2, int[] data) {
        int start=s1;
        int k=0;
        int[] temp=new int[e2-s1+1];
        while(s1<=e1&&s2<=e2){
            if (data[s1] < data[s2]) {
                temp[k++]=data[s1++];
            }else{
                temp[k++]=data[s2++];
            }
        }
        while(s1<=e1){
            temp[k++]=data[s1++];
        }
        while(s2<=e2){
            temp[k++]=data[s2++];
        }
        for(int i=0;i<k;i++){
            data[start+i]=temp[i];
        }
    }

    public static void main(String[] args) {
        MergeSort sort=new MergeSort();
        sort.test();
    }
}
