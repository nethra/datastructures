package com.practice.Miscellaneous;

public class SwapTwoNumbersWithoutTempVariable {
    public static void main(String[] args) {
        int a = 30;
        int b = 60;

        a = a+b; //90
        b = a-b; //30
        a= a-b; //60

        System.out.println(a);
        System.out.println(b);


        //XOR operation

      /*  a = a^b;
        b = a^b;
        a= a^b;
        System.out.println(a);
        System.out.println(b);*/

    }
}
