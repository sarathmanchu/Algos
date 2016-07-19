package com.example.helloworld.producerconsumer.DynPr;

/**
 * Created by sarath on 7/18/16.
 */
public class MaxSumNonAdj {
    static int maxSum(int[] arr){
        int excl=0,incl=arr[0];
        for (int i = 1; i <arr.length ; i++) {
            int tmp=incl;
            incl=Math.max(excl+arr[i],incl);
            excl=tmp;
        }
        return incl;
    }
    //Recursive
    static int maxSum(int arr[],int index){
        if(index==0)
            return arr[0];
        else if(index==1)
            return Math.max(arr[1],arr[0]);
        else
            return Math.max(maxSum(arr,index-2)+arr[index],maxSum(arr,index-1));
    }
    public static void main(String[] args) {
        int arr[] = { 2, 10, 13, 4, 2, 15, 10 };
        System.out.println(maxSum(arr));
    }
}
