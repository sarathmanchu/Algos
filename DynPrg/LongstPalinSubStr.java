package com.example.helloworld.producerconsumer.DynPr;

/**
 * Created by sarath on 7/16/16.
 */
public class LongstPalinSubStr {
    static String longestPalindrome(String str){
        int n=str.length();
        boolean[][] refTable=new boolean[n][n];
        int max_len=1;
        int palinBeginsAt=0;
        for (int i = 0; i <str.length() ; i++) {
            refTable[i][i]=true;
        }
        for (int i = 0; i <n-1 ; i++) {
            if(str.charAt(i)==str.charAt(i+1)) {
                refTable[i][i] = true;
                palinBeginsAt=i;
                max_len=2;
            }
        }
        for (int curr_len = 3; curr_len <=n ; curr_len++) {
            for (int i = 0; i <=n-curr_len ; i++) {
                int j=i+curr_len-1;
                if(str.charAt(i)==str.charAt(j) && refTable[i+1][j-1]){
                    refTable[i][j]=true;
                    palinBeginsAt=i;
                    max_len=curr_len;
                }
            }
        }
        return str.substring(palinBeginsAt,max_len+palinBeginsAt);
    }
    public static void main(String[] args) {
        System.out.println(longestPalindrome("BANANA"));
    }
}
