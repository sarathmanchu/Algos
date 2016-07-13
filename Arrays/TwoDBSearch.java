package com.example.helloworld.producerconsumer.Arrays;

/**
 * Created by sarath on 7/13/16.
 */
public class TwoDBSearch {
    static boolean findElement(int[][] arr,int num){
        boolean numFound=false;
        int row=0;
        int col=arr[0].length-1;
        while (!numFound){
            int ele=arr[row][col];
            if(ele==num) {
                numFound=true;
                return true;
            }
            else if(ele>num)
                col--;
            else if(ele<num)
                row++;
            if(row>arr[0].length || col<0)
                return false;
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] a = { { 1, 2, 3, 4 }, { 6, 7, 8, 9 }, { 13, 14, 15, 16 },
                { 17, 18, 19, 20 }, { 22, 23, 24, 26 } };
        System.out.println(findElement(a,25));

    }
}
