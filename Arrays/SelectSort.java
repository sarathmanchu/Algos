package com.example.helloworld.producerconsumer.Arrays;

import java.util.Arrays;

/**
 * Created by sarath on 7/12/16.
 */
public class SelectSort {
    public static void selectionSort(int[] arr){
        int n=arr.length;
        for (int i = 0; i < n; i++) {
            int minIndex=i;
            for (int j = i+1; j <n ; j++) {
                if(arr[minIndex]>arr[j])
                    minIndex=j;
            }
            if(i!=minIndex && arr[i]!=arr[minIndex])
                swap(arr,i,minIndex);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp=arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }

    public static void main(String[] args) {
        int[] arr={11, 34, 87, 26, 8, 5, 5};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
