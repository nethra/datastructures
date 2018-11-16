package com.practice.Array;

//Write a function rotate(ar[], d, n) that rotates arr[] of size n by d elements.
public class ArrayRotation {

    public static int[] LefttRotation(int[] arr, int d)
    {
        int counter =0;
        while(counter<d) {
            int temp = arr[0];
            for (int i = 0; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[arr.length - 1] = temp;
            counter++;
        }
        return arr;
    }

    public static int[] RightRotation(int[] arr, int d)
    {
        int counter=0;
        while(counter<d) {
            int temp = arr[arr.length-1];
            for (int i = arr.length-1; i > 0; i--) {
                arr[i] = arr[i-1];
            }
            arr[0] = temp;
            counter++;
        }
       return arr;
    }

    public static void PrintArray(int[] arr)
    {
        for(int j=0; j<arr.length; j++)
        {
            System.out.print(arr[j] + " ");

        }
    }
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4,5,6,7};
        int d =2;
        int counter=0;
        //left rotatuion

        LefttRotation(arr,d);

        PrintArray(arr);

        System.out.println();

        RightRotation(arr,d);

        PrintArray(arr);
        // right rotation

        //print Array

    }
}
