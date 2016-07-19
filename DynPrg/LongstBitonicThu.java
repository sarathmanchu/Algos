package com.example.helloworld.producerconsumer.DynPr;

import java.util.Arrays;

/**
 * Created by sarath on 7/18/16.
 */
public class LongstBitonicThu {
    static int bintonicLogst(int[] arr){
        int[] lsqnce=new int[arr.length];
        int[] lRsqnce=new int[arr.length];

        for (int i = 0; i <arr.length ; i++) {
            lsqnce[i]=1;
            lRsqnce[i]=1;
        }
        for (int i = 1; i <arr.length ; i++) {
            for (int j = 0; j <i ; j++) {
                if(arr[i]>arr[j] &&lsqnce[i]<lsqnce[j]+1)
                    lsqnce[i]=lsqnce[j]+1;
            }
        }
        System.out.println(Arrays.toString(lsqnce));
        for (int i = arr.length-2; i >=0 ; i--) {
            for (int j = arr.length-1; j >i ; j--) {
                if(arr[i]>arr[j] && lRsqnce[i]<lRsqnce[j]+1)
                    lRsqnce[i]=lRsqnce[j]+1;
            }
        }
        System.out.println(Arrays.toString(lRsqnce));
        int max=1;
        for (int i = 0; i <arr.length ; i++) {
            if(max<(lRsqnce[i]+lsqnce[i]-1))
                max=lRsqnce[i]+lsqnce[i]-1;
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={1,4,3,7,2,1,8,11,13,0};
        System.out.println(bintonicLogst(arr));
    }
}
