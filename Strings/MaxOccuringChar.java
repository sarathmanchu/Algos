package com.example.helloworld.producerconsumer.Strings;

import java.util.Arrays;

/**
 * Created by Sarath on 7/10/16.
 */
public class MaxOccuringChar {
    static char maxOccuringChar(char[] str){
        int[] charArray=new int[256];
        for (int i = 0; i < str.length; i++) {
            charArray[str[i]]+=1;
        }
        int count=0;char res=' ';
        for (int i = 0; i <str.length ; i++) {
            if(charArray[str[i]]>count){
               count=charArray[str[i]];
               res=str[i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String str="this is string s s";
        System.out.println(maxOccuringChar(str.toCharArray()));
    }
}
