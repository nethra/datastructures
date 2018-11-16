package com.practice.Numbers;

public class FibonacciSeries {

    public static void main(String[] args) {
        int n =10;

        if(n==0 || n==1)
        {
            System.out.println(1);
        }
        int sum =0;
        for(int i=1; i<=n;i++)
        {
            sum = sum +i;
            System.out.println(sum);
        }


    }
}
