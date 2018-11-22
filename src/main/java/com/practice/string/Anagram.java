package com.practice.string;

import java.util.Arrays;

public class Anagram {

    public static boolean CheckAnagram(char[] str1, char[] str2) {

        int[] count1 = new int[256];
        int[] count2 = new int[256];

        Arrays.fill(count1, 0);

        Arrays.fill(count2, 0);

        if (str1.length != str2.length) {
            return false;

        }

        for (int i = 0; i < str1.length; i++) {
            count1[str1[i]]++;
            count1[str2[i]]++;

        }
        for (int i = 0; i < str1.length; i++) {
            if (count1[i] != count2[i]) {
                return false;
            }

        }

        return true;
    }

    public static void main(String[] args) {
        char[] str1 = "army".toCharArray();
        char[] str2 = "mary".toCharArray();
        if (CheckAnagram(str1, str2)) {
            System.out.println("Two Strings are Anagram");
        } else {
            System.out.println("Two Strings are not Anagram");
        }

    }
}
