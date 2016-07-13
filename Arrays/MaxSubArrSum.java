package com.example.helloworld.producerconsumer.Arrays;

/**
 * Created by sarath on 7/13/16.
 */
public class MaxSubArrSum {
    public static void main(String[] args) {
        int[] input = {2, -9, 5, 1, -4, 6, 0, -7, 8};
        System.out.println("Maximum subarray sum is " + findMaxSubarraySum(input));
    }

    private static int findMaxSubarraySum(int[] arr) {
        int maxEndingHere=arr[0],maxSoFar=arr[0];
        for (int i = 0; i < arr.length; i++) {
            maxEndingHere=Math.max(arr[i],arr[i]+maxEndingHere);
            maxSoFar=Math.max(maxSoFar,maxEndingHere);
        }
        return maxSoFar;
    }
}
