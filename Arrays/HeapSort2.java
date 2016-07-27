package com.example.helloworld.producerconsumer.Arrays;

import java.util.Arrays;

/**
 * Created by sarath on 7/16/16.
 */
public class HeapSort2 {
    static void maxHeapify(int[] arr,int curIdx,int heapSize){
        int left=(2*curIdx)+1;
        int right=(2*curIdx)+2;
        int largest=curIdx;

        if(left<heapSize && arr[left]>arr[largest])
            largest=left;
        if(right<heapSize && arr[right]>arr[largest])
            largest=right;
        if(largest!=curIdx){
            swap(arr,curIdx,largest);
            maxHeapify(arr,largest,heapSize);
        }

    }
    private static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
    static void buildMaxHeap(int[] arr,int heapSize){
        int lastEleIdx=heapSize-1;
        int parentIdx=(lastEleIdx-1)/2;
        for (int i = lastEleIdx; i >=0 ; i--) {
            maxHeapify(arr,i,heapSize);
        }
    }
    static void heapSort(int[] arr){
        if(arr==null || arr.length<2)
            return;
        buildMaxHeap(arr,arr.length);
        int heapSize=arr.length;
        for (int i = arr.length-1; i >0 ; i--) {
            swap(arr,0,i);
            heapSize-=1;
            maxHeapify(arr,0,heapSize);
        }

    }
    public static void main(String[] args) {
        int[] arr = {12, 35, 87, 26, 9, 28, 7};
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
