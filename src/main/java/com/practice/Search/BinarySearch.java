package com.practice.Search;

public class BinarySearch {

    public static int search(int[] arr, int l, int r, int x) {


        if (r > 1) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x)
                return mid;


            if (arr[mid] > x)
                return search(arr, 0, mid - 1, x);

            else
                return search(arr, mid + 1, r, x);
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 35, 40, 68, 70, 78};

        System.out.println(search(arr, 0, arr.length - 1, 40));

    }
}
