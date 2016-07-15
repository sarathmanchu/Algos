package com.example.helloworld.producerconsumer.Arrays;

import java.util.Arrays;

/**
 * Created by sarath on 7/14/16.
 */
public class HeapSort {
    static void buildMaxHeap(int[] arr,int heapSize){
        int lastElementIndex=arr.length-1;
        int parentIndex=(lastElementIndex-1)/2;
        for (int i = parentIndex; i >=0 ; i--) {
            maxheapify(arr,i,heapSize);
        }
    }
    static void maxheapify(int[] arr,int curIndex,int heapSize){
        int left=(2*curIndex)+1;
        int right=(2*curIndex)+2;
        int largest=curIndex;

        if(left<heapSize && arr[left]> arr[curIndex])
            largest=left;
        if(right<heapSize && arr[right]>arr[largest])
            largest=right;
        if(largest!=curIndex){
            swap(arr,curIndex,largest);
            maxheapify(arr,largest,heapSize);
        }
    }
    static void heapSort(int[] arr){
        if(arr == null || arr.length < 2)
            return;
        buildMaxHeap(arr,arr.length);
        int heapSize=arr.length;
        for (int i = arr.length-1; i >0 ; i--) {
            swap(arr,0,i);
            heapSize=heapSize-1;
            System.out.println(heapSize);
            System.out.println(Arrays.toString(arr));
            maxheapify(arr,0,heapSize);
        }

    }
    private static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
    public static void main(String[] args) {
        int[] array = {12, 35, 87, 26, 9, 28, 7};
        heapSort(array);
        System.out.println(Arrays.toString(array));
    }
}
