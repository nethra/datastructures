package com.practice.Search;

public class LinearSearch {

    public static int search(int[] arr, int x)
    {
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] ==x)
            {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {10,20, 40, 70,30,35,78,68};

        System.out.println(search(arr, 35));

    }
}
