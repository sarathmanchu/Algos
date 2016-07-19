package com.example.helloworld.producerconsumer.DynPr;

import java.util.Arrays;

/**
 * Created by sarath on 7/18/16.
 */
public class MaxSumIncSubSeq {
    static int maxSumSeq(int arr[]){
        int[] sumArr=new int[arr.length];
        int[] parArr=new int[arr.length];
        int maxSum=0,maxSumIdx=-1;
        for (int i = 0; i <arr.length ; i++) {
            sumArr[i]=arr[i];
            parArr[i]=i;
        }
        for (int i = 1; i <arr.length ; i++) {
            for (int j = 0; j <i ; j++) {
                if(arr[i]>arr[j] && sumArr[i]<sumArr[j]+arr[i]){
                    sumArr[i]=sumArr[j]+arr[i];
                    parArr[i]=j;
                    if(maxSum<sumArr[i]){
                        maxSum=sumArr[i];
                        maxSumIdx=i;
                    }
                }
            }
        }
        System.out.println(arr[maxSumIdx]);
        for (int i = maxSumIdx; i >=0 ; i--) {
            System.out.println(arr[parArr[i]]);
            i=parArr[i];
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr={4,6,1,3,8,4,6};
        System.out.println(maxSumSeq(arr));
    }
}
