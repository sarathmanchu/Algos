package com.example.helloworld.producerconsumer.Strings;

import java.util.Arrays;

/**
 * Created by Sarath on 7/12/16.
 */
public class LongestSubSequence {
    static char[] longestSubSequence(char[] str1,char[] str2){
        int len1=str1.length,len2=str2.length;
        int max=-1;
        int[][] matchArr=new int[len1+1][len2+1];
        for (int i = 1; i <matchArr.length ; i++) {
            for (int j = 1; j <matchArr[i].length ; j++) {
                if(str1[i-1]==str2[j-1])
                    matchArr[i][j]=matchArr[i-1][j-1]+1;
                else
                    matchArr[i][j]=Math.max(matchArr[i][j-1],matchArr[i-1][j]);
                if(matchArr[i][j]>max)
                    max=matchArr[i][j];
            }
        }
        int index=matchArr[len1][len2];
        int i=len1;
        int j=len2;
        char lcs[]=new char[index];
        while (i>0 && j>0){
            if(str1[i-1]==str2[j-1])
            {
                lcs[index-1]=str1[i-1];
                i--;j--;index--;
            }
            else if(matchArr[i-1][j]>matchArr[i][j-1])
                i--;
            else
                j--;
        }
        return lcs;
    }
    public static void main(String[] args) {
        char[] lcs=longestSubSequence("AXGGTAB".toCharArray(),"XGTXAYB".toCharArray());
        System.out.println(Arrays.toString(lcs)+" with of length "+lcs.length);
    }
}
