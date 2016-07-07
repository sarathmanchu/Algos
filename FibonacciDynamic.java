package com.example.helloworld.producerconsumer.Algos;

/**
 * Created by h128850 on 7/7/16.
 */
public class FibonacciDynamic {
    static int[] fibTD;
    public static void main(String[] args) {
        FibonacciDynamic fiD=new FibonacciDynamic();
        System.out.println(fiD.fibonacciBotUp(8));
    }

    int fibonacciBotUp(int n){
        int fib[] =new int[n+1];
        fib[0]=0;
        fib[1]=1;
        for (int i = 2; i <= n; i++) {
            fib[i]=fib[i-1]+fib[i-2];
        }
        return fib[n];
    }

}
