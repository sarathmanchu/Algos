package com.example.helloworld.producerconsumer.Algos;

/**
 * Created by Sarath on 7/7/16.
 */
public class FindNumberIn2DSorted {
    boolean findNumber(int[][] arr,int num){
        int row=0;
        int col=arr[0].length-1;
        while(row <= arr.length-1 && col >=0){
            int ele=arr[row][col];
            if(ele==num){
                System.out.println(row+" "+col);
                return true;
            }else if(ele>num){
                col--;
            }else
                row++;
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] arr={ { 1, 2, 3, 4 }, { 6, 7, 8, 9 }, { 13, 14, 15, 16 },
                { 17, 18, 19, 20 }, { 22, 23, 24, 26 } };
        FindNumberIn2DSorted findNumberIn2DSorted=new FindNumberIn2DSorted();
        System.out.println(findNumberIn2DSorted.findNumber(arr,26));

    }
}
