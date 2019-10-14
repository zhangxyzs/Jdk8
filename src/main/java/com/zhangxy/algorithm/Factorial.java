package com.zhangxy.algorithm;

/**
 * 阶乘防止溢出
 *
 * @author zhangxy
 * @date 2019/10/14
 **/
public class Factorial {
    public static void main(String[] args) {
        System.out.println("Integer的最大值");
        System.out.println(Integer.MAX_VALUE);
        int data=12;
        System.out.println(data+"的阶乘为："+factorialRecursion(data));
        factorial(data);
        data=13;
        System.out.println(data+"的阶乘为："+factorialRecursion(data));
        factorial(data);
        data=14;
        System.out.println(data+"的阶乘为："+factorialRecursion(data));
        factorial(data);
    }

    /**
     * 一般的阶乘
     * @param data
     */
    public static int factorialRecursion(int data){
        if(data==0||data==1){
            return 1;
        }
        return factorialRecursion(data-1)*data;
    }
    public static void factorial(int data){
        int[] array=new int[100];
        //表示递归值的位数
        array[0]=1;
        int bit=1;
        int i,j,k;
        //先计算i!的阶乘，再计算（i+1）!
        for(i=2;i<=data;i++){
            //对每一位进行相乘
            for(j=0;j<bit;j++){
                array[j]=array[j]*i;
            }
            //对0到bit-2 每一位进行进位
            for(j=0;j<bit-1;j++){
                //除数
                int carry=array[j]/10;
                //余数
                array[j]=array[j]%10;
                k=j;
                array[k+1]+=carry;
            }
            //计算最高位进位
            if(array[bit-1]>=10){
                int carry=array[bit-1]/10;
                array[bit-1]=array[bit-1]%10;
                while (carry!=0) {
                    array[bit] = carry%10;
                    carry=carry/10;
                    bit++;
                }
            }
        }
        System.out.print(data+"的阶乘为: ");
        for(i=bit-1;i>=0;i--){
            System.out.print(array[i]);
        }
        System.out.println();
    }
}
