package com.example.helloworld.producerconsumer.Strings;

/**
 * Created by sarath on 7/12/16.
 */
public class FindEditDistance {
    static int findEditDistance(String str1,String str2){
        int len1=str1.length();
        int len2=str2.length();
        int[][] dynArr=new int[len1+1][len2+1];

        for (int i = 0; i < dynArr.length; i++) {
            for (int j = 0; j < dynArr[i].length; j++) {
                if(i==0)
                    dynArr[i][j]=j;
                else if(j==0)
                        dynArr[i][j]=i;
                else if(str1.charAt(i-1)==str2.charAt(j-1))
                    dynArr[i][j]=dynArr[i-1][j-1];
                else {
                    dynArr[i][j]=Math.min(dynArr[i-1][j-1],Math.min(dynArr[i-1][j],dynArr[i][j-1]))+1;
                }
            }
        }
    return dynArr[dynArr.length-1][dynArr[0].length-1];
    }
    public static void main(String[] args) {
        System.out.println(findEditDistance("intention", "executiox"));
    }
}
