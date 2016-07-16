package com.example.helloworld.producerconsumer.Arrays;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;

/**
 * Created by sarath on 7/15/16.
 */
public class GetAllDuplicates {
    Set<Integer> getAllDuplicates(int[] arr){
        Set<Integer> set=new HashSet<>();
        for (int i = 0; i <arr.length ; i++) {
            if(arr[Math.abs(arr[i])]>0)
                arr[Math.abs(arr[i])]=-arr[Math.abs(arr[i])];
            else
                set.add(Math.abs(arr[i]));
        }
        return set;
    }
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 2, 6, 1, 6, 3, 5,5};
        GetAllDuplicates getAllDuplicates=new GetAllDuplicates();
        System.out.println(getAllDuplicates.getAllDuplicates(arr));
    }
}
