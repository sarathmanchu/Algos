package com.example.helloworld.producerconsumer.Strings;

import java.util.Arrays;

/**
 * Created by sarath on 7/11/16.
 */
public class NbitsStrings {
     int[] arr;

    public NbitsStrings(int n) {
        this.arr=new int[n];
    }

     void nBits(int n){
        if(n<=0)
            System.out.println(Arrays.toString(arr));
        else {
            arr[n-1]=0;
            nBits(n-1);
            arr[n-1]=1;
            nBits(n-1);
        }
    }
    public static void main(String[] args) {
        int n=4;
        NbitsStrings nbitsStrings=new NbitsStrings(n);
        nbitsStrings.nBits(n);
    }
}
