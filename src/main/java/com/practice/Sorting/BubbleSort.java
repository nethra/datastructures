package com.practice.Sorting;

public class BubbleSort {

    public static void main(String[] args) {

        int arr[] = new int[] {100,30,60,70,40,35,2,78};

        for(int i=0; i<arr.length-1; i++)
        {
            for(int k=0; k<arr.length-i-1;k++)
            {
                if(arr[k]<arr[k+1])
                {
                    int temp = arr[k];
                    arr[k]=arr[k+1];
                    arr[k+1] = temp;
                }
            }
        }

        for(int x =0; x<arr.length; x++)
        {
            System.out.println(arr[x]);
        }

    }
}
