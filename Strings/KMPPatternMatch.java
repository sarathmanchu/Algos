package com.example.helloworld.producerconsumer.Strings;

import java.util.Arrays;

/**
 * Created by sarath on 7/12/16.
 */
public class KMPPatternMatch {
    static int[] computeLPSArr(String str){

        int j=0,i=1;
        int[] lps=new int[str.length()];
        while (i<lps.length){
            if(str.charAt(i)==str.charAt(j)){
                lps[i]=j+1;
                i++;j++;
            }else {
                if(j!=0){
                    j=lps[j-1];
                }else {
                    lps[i]=0;
                    i++;
                }
            }
        }
        return lps;
    }
    static void patternSearch(String str,String pattern,int[] lps){
        int pat_index=0,str_index=0;
        while (str_index<str.length()){
            if(pattern.charAt(pat_index)==str.charAt(str_index))
            {
                pat_index++;str_index++;
                if(pat_index==pattern.length())
                {
                    System.out.println("pattern matched at index"+(str_index-1));
                    pat_index=lps[pat_index-1];
                }
            }else {
                if(pat_index!=0){
                    pat_index=lps[pat_index-1];
                }else {
                    str_index++;
                }
            }
        }
    }
    public static void main(String[] args) {

        String pattern="ananab#banana";
        int[] lps=computeLPSArr(pattern);
        System.out.println("LPS Array is "+ Arrays.toString(lps));
        String str = "ananab#banancananab#banana";
        patternSearch(str,pattern,lps);
    }
}
