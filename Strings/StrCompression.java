package com.example.helloworld.producerconsumer.Strings;

/**
 * Created by sarath on 7/11/16.
 */
public class StrCompression {
    static String compression(char[] str){
        StringBuffer sb=new StringBuffer();
        int count=1;
        char prev=str[0];
        for (int i = 1; i < str.length; i++) {
            if(str[i]==prev)
                count++;
            else {
                sb.append(prev);
                sb.append(count);
                prev=str[i];
                count=1;
            }
        }
        sb.append(prev);
        sb.append(count);
        return sb.toString();
    }
    public static void main(String[] args) {
        String str="kkkkkuuuummmmmkkkkktttttttg";
        System.out.println(compression(str.toCharArray()));
    }
}
