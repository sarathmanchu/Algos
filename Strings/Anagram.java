package com.example.helloworld.producerconsumer.Strings;

/**
 * Created by Sarath on 7/11/16.
 */
public class Anagram {
    static boolean isAnagram(String str1,String str2){
        int[] binMap=new int[255];
        for (int i = 0; i <str1.length() ; i++) {
            binMap[str1.charAt(i)]++;
        }
        for (int i = 0; i < str2.length(); i++) {
            if(binMap[str2.charAt(i)]!=0){
                binMap[str2.charAt(i)]--;
            }else if(binMap[str2.charAt(i)]==0)
                return false;
        }
        for (int i = 0; i < binMap.length; i++) {
            if(binMap[i]!=0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String str1="message";
        String str2="ssmeega";
        System.out.println(isAnagram(str1,str2));
    }
}
