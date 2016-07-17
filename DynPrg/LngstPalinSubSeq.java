package com.example.helloworld.producerconsumer.DynPr;

/**
 * Created by sarath on 7/17/16.
 */
public class LngstPalinSubSeq {
    static int longestPalindrome(String str){
        int n=str.length();
        int[][] palArr=new int[n][n];
        for (int i = 0; i <n ; i++) {
            palArr[i][i]=1;
        }
        for (int curr_len =2 ; curr_len <=n ; curr_len++) {
            for (int i = 0; i <=n-curr_len ; i++) {
                int j=i+curr_len-1;
                if(str.charAt(i)==str.charAt(j))
                    palArr[i][j]=palArr[i+1][j-1]+2;
                else
                    palArr[i][j]=Math.max(palArr[i+1][j],palArr[i][j-1]);
            }
        }
        return palArr[0][n-1];
    }
    public static void main(String[] args) {
        System.out.println(longestPalindrome("LPSSAPAL"));
    }
}
