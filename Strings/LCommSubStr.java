package com.example.helloworld.producerconsumer.Strings;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by sarath on 7/12/16.
 */
public class LCommSubStr {
    static HashSet<String> LongestSubString(String str1,String str2){
        int[][] matchArr=new int[str1.length()][str2.length()];
        int len1=str1.length();
        int len2=str2.length();

        int max=-1;
        HashSet<String> resultSet=new HashSet<>();

        for (int i = 0; i < len1; i++) {
            for (int j = 0; j < len2; j++) {
                if(str1.charAt(i)==str2.charAt(j)){
                    if(i==0 ||j==0)
                        matchArr[i][j]=1;
                    else
                        matchArr[i][j]=matchArr[i-1][j-1]+1;
                    if(matchArr[i][j]>max){
                        max=matchArr[i][j];
                        resultSet=new HashSet<>();
                        resultSet.add(str1.substring(i-max+1,i+1));
                    }else if(matchArr[i][j]==max){
                        resultSet.add(str1.substring(i-max+1,i+1));
                    }
                }else
                  matchArr[i][j]=0;
            }
        }
        return resultSet;
    }
    public static void main(String[] args) {
        HashSet<String> resultSet=LongestSubString("CLCL", "CLCL");
        for (String str:resultSet) {
            System.out.println(str);
        }
    }
}
