package com.example.helloworld.producerconsumer.DynPr;

/**
 * Created by sarath on 7/16/16.
 */
public class MaxSquareSizeOneMatrix {
    static int maxSquareSizeOnes(int[][] arr){
        int maxSize=0;
        int[][] dpMat= new int[arr.length][arr[0].length];
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[0].length ; j++) {
                if(i==0 || j==0)
                    dpMat[i][j]=arr[i][j];
                else if(arr[i][j]==0)
                    dpMat[i][j]=0;
                else
                    dpMat[i][j]=Math.min(dpMat[i-1][j],Math.min(dpMat[i-1][j-1],dpMat[i][j-1]))+1;
                maxSize=dpMat[i][j]>maxSize ? dpMat[i][j] :maxSize;
            }
        }
        return maxSize;
    }
    public static void main(String[] args) {
        int[][] arr={ { 0, 1, 1, 0, 1, 1 },
                { 1, 1, 0, 1, 1, 1 },
                { 0, 1, 1, 1, 0, 0 },
                { 1, 1, 1, 1, 0, 0 },
                { 1, 1, 1, 1, 1, 0 },
                { 0, 1, 1, 1, 0, 1 }
        };
        System.out.println(maxSquareSizeOnes(arr));
    }
}
