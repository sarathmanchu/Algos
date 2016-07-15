package com.example.helloworld.producerconsumer.Arrays;

import java.util.HashSet;

/**
 * Created by sarath on 7/14/16.
 */
public class FindFirstRepeating {
    static int findFirstRepeating(int[] arr){
        int curIndex=-1;
        HashSet<Integer> hs=new HashSet<>();
        for (int i = arr.length-1; i >=0 ; i--) {
            if(!hs.add(arr[i])){
                curIndex=i;
            }
        }
        if(curIndex!=-1)
        return arr[curIndex];
        return -1;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,5,7,3,10};
        System.out.println(findFirstRepeating(arr));
    }
}
