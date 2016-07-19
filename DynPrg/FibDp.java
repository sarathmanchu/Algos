package com.example.helloworld.producerconsumer.DynPr;

/**
 * Created by sarath on 7/18/16.
 */
public class FibDp {
    static int fib(int n){
        int n1=0, n2=1,sum=0;
        if(n==0 || n==1) {
            System.out.println(n);
            return n;
        }
        for (int i = 2; i <=n ; i++) {
            sum=n1+n2;
            n1=n2;
            n2=sum;
            System.out.println(sum);
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(fib(5));
    }
}
