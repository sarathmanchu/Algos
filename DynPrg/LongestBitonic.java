package com.example.helloworld.producerconsumer.DynPr;

import java.util.Arrays;

/**
 * Created by sarath on 7/17/16.
 */
public class LongestBitonic {
    static int bitonicSequence(int[] arr){
        int n=arr.length;
        int[] lSequnece=new int[n];
        int[] lBitonic=new int[n];

        for (int i = 0; i <n ; i++) {
            lSequnece[i]=1;
            lBitonic[i]=1;
        }
        for (int i = 1; i <n ; i++) {
            for (int j = 0; j <i ; j++) {
                if(arr[i]>arr[j] && lSequnece[i]<lSequnece[j]+1)
                    lSequnece[i]=lSequnece[j]+1;

            }
        }
        for (int i = n-2; i >=0 ; i--) {
            for (int j = n-1; j >i ; j--) {
                if(arr[i]>arr[j] && lBitonic[i]<lBitonic[j]+1)
                    lBitonic[i]=lBitonic[j]+1;
            }
        }
        System.out.println(Arrays.toString(lSequnece));
        System.out.println(Arrays.toString(lBitonic));
        int max=0,tmp=0;
        for (int i = 0; i <n ; i++) {
            tmp=lBitonic[i]+lSequnece[i]-1;
            max=max<tmp ?tmp:max;
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={ 12, 18, 7, 34, 30, 28, 90, 88 };
        System.out.println(bitonicSequence(arr));
    }
}
