package com.example.helloworld.producerconsumer.Algos;

import java.util.Arrays;

/**
 * Created by Sarath on 7/7/16.
 */
public class QuickSort {
    int[] arr;

    public QuickSort(int[] arr) {
        this.arr = arr;
    }

    public static void main(String[] args) {
        int arr[]={5,4,6,9,2,3};
        QuickSort quickSort=new QuickSort(arr);
        System.out.println(Arrays.toString(quickSort.arr));
        quickSort.quickSort(0,arr.length-1);
        System.out.println(Arrays.toString(quickSort.arr));
    }
    void quickSort(int low,int high){
        int mid=(low+high)/2;
        int left=low;
        int right=high;
        int pivot=arr[mid];

        while (left<=right){
            while (arr[left]<pivot)
                left++;
            while (arr[right]>pivot)
                right--;

            if(left<=right){
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;right--;
            }
        }
        if(low<right)
            quickSort(low,right);
        if(high>left)
            quickSort(left,high);
    }

}
