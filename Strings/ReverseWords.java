package com.example.helloworld.producerconsumer.Strings;

/**
 * Created by Sarath on 7/10/16.
 */
public class ReverseWords {
    void reverse(char[] str){
        int l=str.length,start=0;
        for (int i = 0; i <l ; i++) {
            if(str[i]==' ' &&i>0){
                reverse(str,start,i-1);
                start=i+1;
            }else if(i==l-1){
                reverse(str,start,i);
            }
        }
        reverse(str,0,l-1);
    }
    void reverse(char[] str,int start,int end){
        while (start<end){
            swap(str,start,end);
            start++;
            end--;
        }
    }
    void swap(char[] str,int start,int end){
        char temp=str[start];
        str[start]=str[end];
        str[end]=temp;
    }
    public static void main(String[] args) {

        char[] str="hello this is String".toCharArray();
        ReverseWords r=new ReverseWords();
        r.reverse(str);
        System.out.println(str);
    }
}
