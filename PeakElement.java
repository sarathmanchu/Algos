package com.example.helloworld.producerconsumer.Algos;

/**
 * Created by h128850 on 7/7/16.
 */
public class PeakElement {

    public static int peakFinding(int[] arr){
        if(arr==null || arr.length==0)
            return -1;
        int n=arr.length;
        int start=0,end=n-1;

        while (start<=end){
            int mid=(start+end)/2;
            if((mid==0 || arr[mid]>=arr[mid-1]) && (mid==n-1 || arr[mid]>=arr[mid+1]))
                return arr[mid];
            else if(mid>0 && arr[mid-1]>arr[mid])
                end=mid-1;
            else
                start=mid+1;

        }
    return -1;
    }
    public static void main(String[] args) {

        int[] arr = { 13, 45, 25, 14, 45, 50, 30 };
        System.out.println("Peak Element is "+peakFinding(arr));
    }
}
