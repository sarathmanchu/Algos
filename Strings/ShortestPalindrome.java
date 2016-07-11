package com.example.helloworld.producerconsumer.Strings;

/**
 * Created by sarath on 7/11/16.
 */
public class ShortestPalindrome {
    static String shortestPalindrome(String str){
        String revStr=new StringBuilder(str).reverse().toString();
        String totStr=str+"#"+revStr;

        int[] lps=new int[totStr.length()];
        int j;
        for (int i = 1; i <lps.length ; i++) {
            j=lps[i-1];
            while (j>0 && totStr.charAt(i)!=totStr.charAt(j))
                j=lps[j-1];
            if(totStr.charAt(i)==totStr.charAt(j))
                lps[i]=j+1;
        }
        return revStr.substring(0,str.length()-lps[totStr.length()-1])+str;
    }
    public static void main(String[] args) {
        System.out.println(shortestPalindrome("abab"));
    }
}
