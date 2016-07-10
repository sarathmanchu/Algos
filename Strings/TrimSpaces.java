package com.example.helloworld.producerconsumer.Strings;

import java.util.Arrays;

/**
 * Created by Sarath on 7/10/16.
 */
public class TrimSpaces {
    public static String trimSpaces(char[] strArray){
        int numOfSpaces=0;
        for (int i = 0; i <strArray.length ; i++) {
            if(strArray[i]==' ')
                numOfSpaces+=1;
            else
                strArray[i-numOfSpaces]=strArray[i];
        }
        strArray= Arrays.copyOf(strArray,strArray.length-numOfSpaces);
        return new String(strArray);
    }

    public static void main(String[] args) {
        String str="hi gghgf jsdg jshgd  hgd  hgd   "   ;
        System.out.println(trimSpaces(str.toCharArray()));
    }
}
