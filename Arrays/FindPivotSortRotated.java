package com.example.helloworld.producerconsumer.Strings;

/**
 * Created by sarath on 7/15/16.
 */
public class FindPivotSortRotated {
    static int findPivot(int[] arr){
        if(arr[0]<arr[arr.length-1])
            return 0;
        int start=0,end=arr.length-1,mid;
        while (start<=end){
            mid=(start+end)/2;
            if(mid<arr.length && arr[mid]>arr[mid+1])
                return mid+1;
            else if(arr[start]<=arr[mid])
                start=mid+1;
            else
                end=mid-1;
        }
        return 0;
    }
    public static void main(String[] args) {
        int arr[]={5,6,7,8,3,4 };
        System.out.println(arr[findPivot(arr)]);
    }
}
