package com.example.helloworld.producerconsumer.Arrays;

/**
 * Created by sarath on 7/19/16.
 */
public class SqRoot {
    static String findSquare(int num){
        Boolean isNegative=false;
        if(num<0){
            isNegative=true;
            num=-num;
        }
        if(num==1)
            return num+(isNegative ? "i":"");
        double start=0;
        double end=num;
        double mid=(start+end)/2;
        double prevMid=0;
        double diff=Math.abs(mid-prevMid);
        double precission=0.005;

        while ((mid*mid !=num) && diff>precission){
            if(mid*mid >num)
                end=mid;
            else
                start=mid;
            prevMid=mid;
            mid=(start+end)/2;
            diff=Math.abs(mid-prevMid);
        }
        return mid+(isNegative ? "i":"");
    }
    public static void main(String[] args) {
        System.out.println(findSquare(1024));
    }
}
