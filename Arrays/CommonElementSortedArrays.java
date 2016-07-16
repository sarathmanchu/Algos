package com.example.helloworld.producerconsumer.Arrays;

/**
 * Created by sarath on 7/15/16.
 */
public class CommonElementSortedArrays {
    static void printCommonElements(int[][] arr){
        int baseIndex=0;
        int indices[]=new int[arr.length-1];
        boolean smallArrExit=false;
        int totalMatchesFound=0;
        while (baseIndex<arr[0].length && !smallArrExit){
            totalMatchesFound=0;
            for (int i = 1; i <arr.length ; i++) {
                int curIndex=indices[i-1];
                while ((curIndex<arr[i].length) && arr[i][curIndex]<arr[0][baseIndex])
                    curIndex++;
                if(curIndex<arr[i].length){
                    if(arr[i][curIndex]==arr[0][baseIndex])
                        totalMatchesFound++;
                }else {
                    smallArrExit=true;
                }
                indices[i-1]=curIndex;
            }
            if(totalMatchesFound==arr.length-1)
                System.out.print(" "+arr[0][baseIndex]);
            baseIndex++;
        }

    }
    public static void main(String[] args) {
        int[][] arr={
                {1,23, 34, 67, 89, 123, 566, 1000},
                {1,11, 22, 23, 24,33, 37, 185, 566, 987, 1223, 1234},
                {1,23, 43, 67, 98, 566, 678},
                {1, 4, 5, 23, 34, 76, 87, 132, 566, 665},
                {1, 2, 3, 23, 24, 344, 566}
        };
        printCommonElements(arr);

    }
}
