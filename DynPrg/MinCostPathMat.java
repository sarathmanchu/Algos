package com.example.helloworld.producerconsumer.DynPr;

/**
 * Created by sarath on 7/18/16.
 */
public class MinCostPathMat {
    static int findMinCostPath(int[][] arr){
        int[][] costArr=new int[arr.length][arr[0].length];
        int row=arr.length;
        int col=arr[0].length;
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <col ; j++) {
                if(i==0 && j==0)
                    costArr[i][j]=arr[i][j];
                else if(i==0)
                    costArr[i][j]=costArr[i][j-1]+arr[i][j];
                else if(j==0)
                    costArr[i][j]=costArr[i-1][j]+arr[i][j];
                else
                    costArr[i][j]=Math.min(costArr[i-1][j],costArr[i][j-1])+arr[i][j];
            }
        }
        int next=arr[row-1][col-1];
        //System.out.println(arr[row-1][col-1]);
        for (int i = row-1; i >0 ; i--) {
            for (int j = col-1; j >0 ; j--) {
                next=Math.min(costArr[i-1][j],costArr[i][j-1]);
                System.out.println(arr[i][j]);
            }
        }
        return costArr[row-1][col-1];
    }
    public static void main(String[] args) {
        int[][] arr={{6,3,5,8},{4,2,1,7},{4,3,2,6}};
        System.out.println(findMinCostPath(arr));
    }
}
