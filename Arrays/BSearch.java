package com.example.helloworld.producerconsumer.Arrays;

/**
 * Created by sarath on 7/13/16.
 */
public class BSearch {
    static int bSearch(int[] arr,int num,int low,int high){
        if(low>high)
            return -1;
        int mid=low+((high-low)/2);
        if(arr[mid]==num) return mid;
        else if(arr[mid]>num) return bSearch(arr,num,low,mid-1);
        else return bSearch(arr,num,mid+1,high);
    }
    public static void main(String[] args) {
        int [] a = {2,5,8,10,14,44,77,78,99};
        System.out.println(bSearch(a,9,0,a.length-1));
    }
}
