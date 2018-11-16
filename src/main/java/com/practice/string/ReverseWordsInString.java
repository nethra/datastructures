package com.practice.string;

//Input : "I love Java Programming"
//Output :"Programming Java love I"
public class ReverseWordsInString {

    public static void main(String[] args) {

        String str = "I love Java Programming";

        String[] arr = str.split(" ");
        String result = "";


        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                result = arr[i] + result;
            } else {
                result = " " + arr[i]  + result;
            }

        }
        System.out.println(result);

    }
}
