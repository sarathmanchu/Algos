package com.example.helloworld.producerconsumer.Arrays;

/**
 * Created by sarath on 7/14/16.
 */
public class OddOccuringNumber {
    static int findOddOccurNumber(int[] arr){
        int e=0;
        for (int i = 0; i <arr.length ; i++) {
            e^=arr[i];
        }
        return e;
    }
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 3, 3, 4,4, 4, 5, 5, 6, 6, 6, 6, 7, 7 };
        System.out.println(findOddOccurNumber(arr));
    }
}
