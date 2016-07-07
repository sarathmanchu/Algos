package com.example.helloworld.producerconsumer.Algos;

import java.util.Arrays;

/**
 * Created by h128850 on 7/7/16.
 */
public class FindMissingTwoNumbers {
    int sum,sumN,p=1,nP=1,a,b;

    public int[] missingTwoNumbers(int[] arr,int range){
        sumN=range*(range+1)/2;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        int resultSum=sumN-sum;
        for (int i = 0; i <arr.length ; i++) {
            p*=arr[i];
        }
        for (int i = 1; i <=range ; i++) {
            nP*=i;
        }
        int resultProduct=nP-p;
        System.out.println(resultProduct);
        int sqrDiff=(int)Math.sqrt((resultSum*resultSum)-(4*resultProduct));
        a=(resultSum+sqrDiff)/2;
        System.out.println(a);
        b=resultSum-a;
        System.out.println(b);

        int[] result={a,b};
        return result;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,6,7,8,9,10};
        FindMissingTwoNumbers findMissingTwoNumbers=new FindMissingTwoNumbers();
        System.out.println(Arrays.toString(findMissingTwoNumbers.missingTwoNumbers(arr,10)));
    }
}
