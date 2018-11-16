package com.practice.Numbers;

public class Factorial {

    public static int Fact(int n)
    {
        if(n==0 || n==1) {
            return 1;
        }
        else
        {
            return n* Fact(n-1);

        }
    }
    public static void main(String[] args) {

        int n =10;

        int factorial = Fact(n);

        System.out.println(factorial);
    }
}
