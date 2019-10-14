package com.zhangxy.algorithm;

/**
 * @author zhangxy
 * @date 2019/10/14
 **/
public class QuickSort extends AbstractSort {
    @Override
    public void sort(int[] data) {
        sortHelp(0,data.length-1,data);
    }

    private void sortHelp(int start, int end, int[] data) {
        if(start>end){
            return;
        }
//        int provit=partationMedian1(data,start,end);
        int provit=sortWay1(start,end,data);
        sortHelp(start,provit-1,data);
        sortHelp(provit+1,end,data);
    }

    /**
     * 左右向中间
     *
     * @param data
     */
    private int sortWay1(int start,int end,int[] data) {
        int medinVal = data[start];
        while (start < end) {
            while (start < end && data[end] > medinVal) {
                end--;
            }
            data[start] = data[end];
            while (start < end && data[start] <= medinVal) {
                start++;
            }
            data[end] = data[start];
        }
        data[start] = medinVal;
        return start;
    }
    public int partationMedian1(int[] arr,int i,int j){
        //前后指针
//        int i=start;
//        int j=end;
        int median=arr[i];
        while(i<j){
            while(i<j&&arr[j]>median){
                j--;
            }
            arr[i]=arr[j];
            while(i<j&&arr[i]<=median){
                i++;
            }
            arr[j]=arr[i];
        }
        arr[i]=median;
        return i;
    }
    public static void main(String[] args) {
        QuickSort sort=new QuickSort();
        sort.test();
    }
}
