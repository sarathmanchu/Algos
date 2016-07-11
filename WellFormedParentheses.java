package com.example.helloworld.producerconsumer.Strings;

/**
 * Created by sarath on 7/11/16.
 */
public class WellFormedParentheses {
    static boolean isWellFormed(String str){
        if(str==null)
            return false;
        int count=0;
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i)=='{')
                count++;
            else if (str.charAt(i)=='}'){
                count--;
                if(count>0)
                    return false;
            }
        }
        if(count==0)
            return true;
        return false;
    }
    public static void main(String[] args) {
        String str = "{}{}";
        System.out.println(isWellFormed(str));
    }
}
