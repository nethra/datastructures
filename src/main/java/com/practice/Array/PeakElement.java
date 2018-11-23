package com.practice.Array;

public class PeakElement {

    public static void main(String[] args) {

        int[] arr = new int[] {1,4,3,6,7,5};

        for(int i=1; i<arr.length-1; i++)
        {
            if( arr[i] > arr[i-1] && arr[i] > arr[i+1])
            {
                System.out.println(arr[i]);
                break;
            }

        }
    }
}
