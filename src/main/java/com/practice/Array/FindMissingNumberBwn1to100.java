package com.practice.Array;

public class FindMissingNumberBwn1to100 {

    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,16,17,18,19,20};
        int num =1;
        while(num<=20) {
            for (int i = 0; i < 20; i++) {

                if (arr[i] == num) {

                    break;

                }
                else
                {
                    System.out.println(num);
                }
            }
            num++;
        }
    }
}
