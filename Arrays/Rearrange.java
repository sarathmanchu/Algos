package com.example.helloworld.producerconsumer.Arrays;

import java.util.Arrays;

/**
 * Created by sarath on 7/13/16.
 */
public class Rearrange {
    static void reArrange(int[] arr){
        int n=arr.length;
        int i=-1,temp=0;
        for (int j = 0; j <n ; j++) {
            if(arr[j]<0){
                i++;
                temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("i is at "+i);
        int pos=i+1,neg=0;
        while(pos<n && neg<pos && arr[neg]<0){
            temp=arr[neg];
            arr[neg]=arr[pos];
            arr[pos]=temp;
            pos++;
            neg+=2;
        }
        System.out.println(Arrays.toString(arr));

    }
    public static void main(String[] args) {
        int arr[] = {-1, 2, -3, 4, 5, 6, -7, 8, 9};
        reArrange(arr);
    }
}
