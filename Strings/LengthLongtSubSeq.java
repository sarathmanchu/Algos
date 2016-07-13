package com.example.helloworld.producerconsumer.Strings;

/**
 * Created by Sarath on 7/12/16.
 */
public class LengthLongtSubSeq {
    static int longestSubSeq(String str1,String str2){
        int len1=str1.length();
        int len2=str2.length();
        int[][] matchArr=new int[len1+1][len2+1];
        int max=0;
        for (int i = 1; i < matchArr.length; i++) {
            for (int j = 1; j <matchArr[i].length ; j++) {
               if(str1.charAt(i-1)==str2.charAt(j-1))
                   matchArr[i][j]=matchArr[i-1][j-1]+1;
                else
                   matchArr[i][j]=Math.max(matchArr[i-1][j],matchArr[i][j-1]);
                if(matchArr[i][j]>max)
                    max=matchArr[i][j];
            }
        }

        return max;

    }
    public static void main(String[] args) {
        System.out.println(longestSubSeq("ABCDGHLQR","FXEDPHR"));
    }
}
