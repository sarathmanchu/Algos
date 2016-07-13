package com.example.helloworld.producerconsumer.Arrays;

/**
 * Created by sarath on 7/13/16.
 */
public class KthSmallestElement {
    static int findKthSmallestElement(int[] arr,int num,int start,int end){
        int left=start;
        int right=end;
        int pivot=start;
        while (left<=right){
            while (left<=right && arr[left]<=arr[pivot])
                left++;
            while (left<=right && arr[right]>=arr[pivot])
                right--;
            if(left<right){
            swap(arr,left,right);
                left++;right--;
            }
        }
        swap(arr,pivot,right);
        if(pivot==num)
            return arr[pivot];
        else if(pivot<num)
            return findKthSmallestElement(arr,num,pivot+1,end);
        else
            return findKthSmallestElement(arr,num,start,pivot-1);
    }
    static public void swap(int[] arrA, int a, int b) {
        int x = arrA[a];
        arrA[a] = arrA[b];
        arrA[b] = x;
    }
    public static void main(String[] args) {
        int[] arr = { 2, 3, 11, 16, 27, 4, 15, 9, 8 };
        System.out.println(findKthSmallestElement(arr,0,0,arr.length-1));
    }
}
