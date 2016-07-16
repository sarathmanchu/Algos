package com.example.helloworld.producerconsumer.Arrays;

import java.util.Stack;

/**
 * Created by sarath on 7/15/16.
 */
public class NextGreaterElements {
    static void printNextGrtElemnts(int[] arr){
        Stack<Integer> st=new Stack<>();
        st.push(arr[0]);
        for (int i = 1; i <arr.length ; i++) {
            while(!st.empty() && st.peek()<arr[i]){
                System.out.println("Next Greater Element for "+st.pop()+" is "+arr[i]);
            }
                st.push(arr[i]);
        }
        while (!st.isEmpty())
        {
            System.out.println("Next Greater Element for "+st.pop()+" is "+null);
        }
    }
    public static void main(String[] args) {
        int[] arr = { 98, 23, 54, 12, 20, 7, 27 };
        printNextGrtElemnts(arr);

    }
}
