package com.example.helloworld.producerconsumer.Algos;

import java.util.Arrays;

/**
 * Created by h128850 on 7/6/16.
 */
public class ArrayReverse {
    static int[] arr;
    public static void reverseByIteration(){
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;end--;
        }
    }
    public static void reverseByRecursive(int start,int end){
        if(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;start++;end--;
            reverseByRecursive(start,end);
        }
    }
    public static void main(String[] args) {
        arr=new int[]{1,2,3,4,5};
        System.out.println("before Reverse "+ Arrays.toString(arr));
        reverseByIteration();
        System.out.println("after reverse by iteration"+Arrays.toString(arr));
        reverseByRecursive(0,arr.length-1);
        System.out.println("after reverse by recursion"+Arrays.toString(arr));
    }
}
