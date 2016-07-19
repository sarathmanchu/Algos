package com.example.helloworld.producerconsumer.DynPr;

/**
 * Created by sarath on 7/18/16.
 */
public class MinJmpsEnd {
    static   int findJumps(int[] arr){
        int[] jmpArr=new int[arr.length];
        int[] parent=new int[arr.length];
        jmpArr[0]=0;
        parent[0]=-1;
        for (int i = 1; i <arr.length ; i++) {
            jmpArr[i]=Integer.MAX_VALUE-1;
        }
        for (int i = 1; i <arr.length ; i++) {
            for (int j = 0; j <i ; j++) {
                if(arr[j]+j>=i && jmpArr[i]>jmpArr[j]+1){
                    jmpArr[i]=jmpArr[j]+1;
                    parent[i]=j;
                }

            }
        }
        int i=parent.length-1;
        while (i!=-1){
            System.out.println(i);
            i=parent[i];
        }
        return jmpArr[jmpArr.length-1];
    }
    public static void main(String[] args) {
        int arr[]={1,3,5,3,2,2,6,1,6,8,9};
        System.out.println(findJumps(arr));
    }
}
