package com.example.helloworld.producerconsumer.DynPr;

import java.util.Arrays;

/**
 * Created by sarath on 7/17/16.
 */
public class MinJumps {
    static int jumpsToEnd(int[] arr){
        int[] jumpArr=new int[arr.length];
        int[] parArr=new int[arr.length];

        jumpArr[0]=0;
        parArr[0]=-1;
        for (int i = 1; i <arr.length ; i++) {
            jumpArr[i]=Integer.MAX_VALUE-1;
        }
        for (int i = 1; i <arr.length ; i++) {
            for (int j = 0; j <i ; j++) {
                if(arr[j]>=i-j && jumpArr[i]>jumpArr[j]+1){
                    jumpArr[i]=jumpArr[j]+1;
                    parArr[i]=j;
                }
            }
        }
        System.out.println(Arrays.toString(jumpArr));
        System.out.println(Arrays.toString(parArr));
        int i=parArr.length-1;
        while (parArr[i]!=-1) {
            System.out.println("elements "+parArr[i]);
            i=parArr[i];
        }
        return jumpArr[arr.length-1];
    }
    public static void main(String[] args) {
        int arr[]={2,3,1,1,2,4,2,0,1,1};
        System.out.println(jumpsToEnd(arr));
    }
}
