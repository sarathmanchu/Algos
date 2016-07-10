package com.example.helloworld.producerconsumer.Strings;

/**
 * Created by h128850 on 7/10/16.
 */
public class PrintDupChars {
    static void printDupChars(char[] str){
        int[] boolMap=new int[255];
        for (int i = 0; i < str.length; i++) {
            boolMap[str[i]]++;
        }
        for (int i = 0; i <str.length ; i++) {
            if(boolMap[str[i]]>1) {
                System.out.println(str[i] + "  " + boolMap[str[i]]);
                boolMap[str[i]]=0;
            }
        }
    }
    public static void main(String[] args) {
        String str=" This is String";
        printDupChars(str.toCharArray());
    }
}
