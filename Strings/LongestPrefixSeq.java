package com.example.helloworld.producerconsumer.Strings;

/**
 * Created by Sarath on 7/11/16.
 */
public class LongestPrefixSeq {


    static String longestPrefix(String[] arr){
        int resultLen=arr[0].length();
        int curr;
        for (int i = 1; i < arr.length; i++) {
            curr=0;
            while (curr<resultLen && curr<arr[i].length() && arr[0].charAt(curr)==arr[i].charAt(curr))
                curr++;
            resultLen=curr;
        }
        return arr[0].substring(0,resultLen);
    }
    public static void main(String[] args) {

        String str = "Summit Summation Summit Summ ";
        String[] arr=str.split(" ");
        System.out.println(longestPrefix(arr));
    }
}
