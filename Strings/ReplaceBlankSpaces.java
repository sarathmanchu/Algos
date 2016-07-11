package com.example.helloworld.producerconsumer.Strings;

/**
 * Created by Sarath on 7/11/16.
 */
public class ReplaceBlankSpaces {
    static String replaceBlankSpaces(char[] str){
        int spaceCount=0;
        for (int i = 0; i < str.length; i++) {
            if(str[i]==' ')
                spaceCount++;
        }
        System.out.println("Space count is "+spaceCount);
        char[] newStr=new char[(str.length+(2*spaceCount))];
        int newLength=newStr.length;
        System.out.println("old length is "+str.length);
        System.out.println("new Length is "+newLength);
        for (int i = str.length-1; i>=0 ; i--) {
            if(str[i]==' '){
                newStr[newLength-1]='0';
                newStr[newLength-2]='2';
                newStr[newLength-3]='%';
                newLength-=3;
            }
            else {
                newStr[newLength-1]=str[i];
                newLength-=1;
            }
        }
        return String.valueOf(newStr);
    }
    public static void main(String[] args) {
        String str="this is string with spaces";
        System.out.println(replaceBlankSpaces(str.toCharArray()).toString());
    }
}
