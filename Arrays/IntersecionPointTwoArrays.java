package com.example.helloworld.producerconsumer.Arrays;

/**
 * Created by sarath on 7/13/16.
 */
public class IntersecionPointTwoArrays {
    static int intersection(int[] arrA,int[] arrB){
        int x=0,y=0;
        int interSectionPoint=-1;
        while (x<arrA.length && y<arrB.length){
            if(arrA[x]>arrB[y])
                y++;
            else if(arrA[x]<arrB[y])
                x++;
            else {
                interSectionPoint=arrA[x];
                return interSectionPoint;
            }
        }
        return interSectionPoint;
    }
    public static void main(String[] args) {
        int[] a = { 1, 2, 3,5, 6, 8, 10 };
        int[] b = { 4, 5, 6, 11, 15, 20 };
        System.out.println(intersection(a,b));

    }
}
