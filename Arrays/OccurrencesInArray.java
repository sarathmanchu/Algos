package com.example.helloworld.producerconsumer.Arrays;

/**
 * Created by sarath on 7/13/16.
 */
public class OccurrencesInArray {
    static int firstOccurence(int[] arr,int num,int start,int end){
        if(end>=start){
            int mid=(start+end)/2;
            if((mid==0 || arr[mid-1]<num) && arr[mid]==num)
                return mid;
            else if(arr[mid]<num)
                return firstOccurence(arr,num,mid+1,end);
            else
                return firstOccurence(arr,num,start,mid-1);
        }else return -1;
    }
    static int lastOccurence(int[] arr,int num,int start,int end){
        if(end>=start){
            int mid=(start+end)/2;
            if((mid==arr.length-1 || arr[mid+1]>num) && (arr[mid]==num))
                return mid;
            else if(arr[mid]>num)
                return lastOccurence(arr,num,start,mid-1);
            else
                return lastOccurence(arr,num,mid+1,end);
        }
        else
            return -1;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,2,2,2,2,2,2,3,4,5,5,6};
        int f=firstOccurence(arr,2,0,arr.length-1);
        System.out.println(f);
        int l=lastOccurence(arr,2,0,arr.length-1);
        System.out.println(l);
        System.out.println(l-f+1);
    }
}
