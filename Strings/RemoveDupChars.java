package com.example.helloworld.producerconsumer.Strings;

/**
 * Created by Sarath on 7/10/16.
 */
public class RemoveDupChars {
    static String removeDupChars(char[] str){
        StringBuilder sBuf = new StringBuilder();
        boolean[] binHash=new boolean[255];
        int dupSpace=0;
        for (int i = 0; i < str.length; i++) {
            if(!binHash[str[i]])
            {
                binHash[str[i]]=true;
                sBuf.append(str[i]);
            }
        }
        return sBuf.toString();
    }
    public static void main(String[] args) {
        String str="this is String";
        removeDupChars(str.toCharArray());
        System.out.println(removeDupChars(str.toCharArray()));
    }
}
