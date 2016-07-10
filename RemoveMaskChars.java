package com.example.helloworld.producerconsumer.Strings;

/**
 * Created by sarath on 7/10/16.
 */
public class RemoveMaskChars {
    static String removeMaskChars(char[] str,char[] mask){
        StringBuilder sb=new StringBuilder();
        boolean[] boolMap=new boolean[255];
        for (int i = 0; i <mask.length ; i++) {
            boolMap[mask[i]]=true;
        }
        for (int i = 0; i <str.length ; i++) {
            if(boolMap[str[i]]!=true)
                sb.append(str[i]);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str="This is String";
        String mask="hisn ";
        System.out.println(removeMaskChars(str.toCharArray(),mask.toCharArray()));
    }
}
