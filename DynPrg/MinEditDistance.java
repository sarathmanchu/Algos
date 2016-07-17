package com.example.helloworld.producerconsumer.DynPr;

/**
 * Created by sarath on 7/17/16.
 */
public class MinEditDistance {
    static int findEditDistance(String str1,String str2){
        int rows=str1.length()+1;
        int col=str2.length()+1;
        int[][] distMat=new int[rows][col];
        int dist=0;
        for (int i = 0; i <rows ; i++) {
            for (int j = 0; j <col ; j++) {
                if(i==0)
                    distMat[i][j]=j;
                else if(j==0)
                    distMat[i][j]=i;
                else if(str1.charAt(i-1)==str2.charAt(j-1))
                    distMat[i][j]=distMat[i-1][j-1];
                else {
                    distMat[i][j]=1+Math.min(Math.min(distMat[i-1][j],distMat[i][j-1]),distMat[i-1][j-1]);
                }
            }
        }
        return distMat[str1.length()][str2.length()];
    }
    public static void main(String[] args) {
        System.out.println(findEditDistance("intention", "executionw"));
    }
}
