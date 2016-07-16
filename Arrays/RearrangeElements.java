package com.example.helloworld.producerconsumer.Arrays;

import java.util.Arrays;

/**
 * Created by sarath on 7/15/16.
 */
public class RearrangeElements {

    boolean isAtProperPos(int[] arr,int index){
        if(index%2==0)
        {
            if(arr[index]>0)
                return true;
        }
        else {
            if(arr[index]<0)
                return true;
        }
        return false;
    }
    int findNextOpp(int[] arr,int index){
        for (int i = index; i <arr.length ; i++) {
            if(arr[index]*arr[i]<0)
                return i;


        }
        return -1;
    }
    void rightRotate(int[] arr,int low,int high){
        int lastEle=arr[high];
        for (int i = high; i >low ; i--) {
            arr[i]=arr[i-1];
        }
        arr[low]=lastEle;
    }

    void rearrangePosNeg(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            if(!isAtProperPos(arr,i)){
                int nextOppIndex=findNextOpp(arr,i);
                if(nextOppIndex!=-1)
                    rightRotate(arr,i,nextOppIndex);
                else
                    return;
            }
        }
    }
    public static void main(String[] args) {
        RearrangeElements rearrangeElements=new RearrangeElements();
        int[] arr = {-1,3,2,4,5,-6,7,-9};
        rearrangeElements.rearrangePosNeg(arr);
        System.out.println(Arrays.toString(arr));
    }
}
