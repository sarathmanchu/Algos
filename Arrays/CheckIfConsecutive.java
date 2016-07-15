package com.example.helloworld.producerconsumer.Arrays;

/**
 * Created by sarath on 7/14/16.
 */
public class CheckIfConsecutive {
     boolean findIfConsecutive(int[] arr){
        int max=findMax(arr);
         int min=findMin(arr);

         if((max-min)==arr.length-1)
         {
             for (int i = 0; i < arr.length; i++) {
                 arr[i]=arr[i]-min+1;
             }
             for (int i = 0; i <arr.length ; i++) {
                 int x=Math.abs(arr[i]);
                 if(arr[x-1]>0)
                     arr[x-1]=arr[x-1]*-1;
                 else
                     return false;
             }
             return true;
         }
         else
             return false;
    }
    int findMax(int[] arr){
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max)
                max=arr[i];
        }
        return max;
    }
    int findMin(int[] arr){
        int min=Integer.MAX_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]<min)
                min=arr[i];
        }
        return min;
    }
    public static void main(String[] args) {
        int [] arr = {21,24,22,26,23,25};
        CheckIfConsecutive checkIfConsecutive=new CheckIfConsecutive();
        System.out.println(checkIfConsecutive.findIfConsecutive(arr));
    }
}
