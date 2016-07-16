package com.example.helloworld.producerconsumer.Arrays;

import java.util.Arrays;

/**
 * Created by sarath on 7/15/16.
 */
public class NextGreaterNumber {
    private void swap(int[] number, int i, int j)
    {
        int temp  = number[i];
        number[i] = number[j];
        number[j] = temp;
    }
    void findNextGreater(int arr[]){
        int lastDigit=arr[arr.length-1],i,j;
        for (i = arr.length-2; i >=0 ; i--) {
            if(lastDigit>arr[i])
                break;
            lastDigit=arr[i];
        }
        if(i>=0){
            for ( j = arr.length-1; j >i ; j--) {
                if(arr[j]>arr[i])
                    break;
            }
            swap(arr,i,j);
            sortSubArray(arr,i+1,arr.length-1);
        }
    }
    void sortSubArray(int[] arr,int low,int high){
        while (low<high){
            swap(arr,low,high);
            low++;high--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {6,9,3,8,6,5,2};
        NextGreaterNumber nextGreaterNumber=new NextGreaterNumber();
        nextGreaterNumber.findNextGreater(arr);
        System.out.println(Arrays.toString(arr));
    }
}
