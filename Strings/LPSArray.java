package com.example.helloworld.producerconsumer.Strings;

import java.util.Arrays;

/**
 * Created by sarath on 7/11/16.
 */
public class LPSArray {

     int[] computeLPSArray(String pattern){
        int j=0;
         int[] lps=new int[pattern.length()];
        lps[0]=0;

        for (int i = 1; i <pattern.length() ; ) {
            if(pattern.charAt(j)==pattern.charAt(i)){
                lps[i]=j+1;
                i++;j++;
            }
            else {
                if(j!=0)
                    j=lps[j-1];
                else {
                    lps[i]=0;
                    i++;
                }
            }
        }
         return lps;
    }
    public static void main(String[] args) {
        LPSArray lpsArray=new LPSArray();
        String pattern = "ananab#banana";
        System.out.println(Arrays.toString(lpsArray.computeLPSArray(pattern)));
    }
}
