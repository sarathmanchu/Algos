package com.example.helloworld.producerconsumer.Strings;

import java.util.HashSet;

/**
 * Created by sarath on 7/11/16.
 */
public class PermutationsOfString {
    static HashSet<String> permutationsOfString(String str){
        HashSet<String> permutations=new HashSet<>();
        if(str==null || str.length()==0) {
            permutations.add("");
            return permutations;
        }
        char first=str.charAt(0);
        String remainigString=str.substring(1);
        HashSet<String> words=permutationsOfString(remainigString);
        for(String word:words){
            for (int i = 0; i <=word.length() ; i++) {
                String prefix=word.substring(0,i);
                String suffix=word.substring(i);
                permutations.add(prefix+first+suffix);
            }
        }
        return permutations;
    }
    public static void main(String[] args) {
        String str="qweretyu";
        System.out.println(permutationsOfString(str).toString());
    }
}
