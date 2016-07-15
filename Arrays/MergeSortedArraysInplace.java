package com.example.helloworld.producerconsumer.Arrays;

import java.util.Arrays;

/**
 * Created by sarath on 7/14/16.
 */
public class MergeSortedArraysInplace {

    static void mergeSortArrayInPlace(int[] arr1,int[] arr2){
        int validIndex=arr1.length-1;
        for (int i = arr1.length-1; i >=0 ; i--) {
            if(arr1[i]!=-1){
            arr1[validIndex]=arr1[i];
                validIndex-=1;
            }
        }
        int i=validIndex+1;
        int j=0,k=0;
        while ((i<arr1.length)&&(j<arr2.length)){
            if(arr1[i]<arr2[j]) {
                arr1[k] = arr1[i];
                i++;k++;
            }
            else {
                arr1[k]=arr2[j];
                k++;j++;
            }
        }
        while (j<arr2.length){
            arr1[k]=arr2[j];
            k++;j++;
        }
    }
    public static void main(String[] args) {
        int[] arrayA = {-3, 5, -1, 7, -1, 10, -1, 11, -1};
        int[] arrayB = {-2, 2, 6, 12};
        mergeSortArrayInPlace(arrayA,arrayB);
        System.out.println(Arrays.toString(arrayA));
    }
}
