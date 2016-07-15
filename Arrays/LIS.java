package com.example.helloworld.producerconsumer.Arrays;

/**
 * Created by sarath on 7/15/16.
 */
public class LIS {
     void longestIncSeq(int[] arr){
        int[] dpArr=new int[arr.length];
        int[] sol=new int[arr.length];
        int max=1;
        for (int i = 0; i < dpArr.length; i++) {
            dpArr[i]=1;
            sol[i]=i;
        }
        for (int i = 1; i <arr.length; i++) {
            for (int j =0 ; j <i ; j++) {
                if(arr[i]>arr[j]){
                    if(dpArr[j]+1>dpArr[i])
                        dpArr[i]=dpArr[j]+1;
                        sol[i]=j;
                }
            }
        }
        for (int i = 0; i < dpArr.length; i++) {
            if(dpArr[i]>max)
                max=i;
        }
        System.out.println("max val is"+dpArr[max]);
         print(arr,sol,max,max,max);
         System.out.println();
        int t=max,newT=max;
         do {
             t=newT;
             System.out.print(arr[t]+" ");
             newT=sol[newT];
         }while (t!=newT);


    }
    void print(int[] arr,int[]sol,int newT,int t,int max){
        t=newT;
        newT=sol[newT];
        if(t!=newT || t==max) {
            print(arr, sol, newT, t, max);
        }
        System.out.print(arr[t] + " ");
    }
    public static void main(String[] args) {
        int arr[] = {23,10,22,5,33,8,9,21,50,41,60,80,99, 22,23,24,25,26,27};
        LIS lis=new LIS();
        lis.longestIncSeq(arr);

    }
}
