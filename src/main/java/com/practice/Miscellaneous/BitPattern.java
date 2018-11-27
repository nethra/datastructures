package com.practice.Miscellaneous;

/* Bit Pattern
Bit Pattern
You are given a string containing 0’s and 1’s and two numbers m and n. Your work is to check if all the bits in the string can be used to make a new string
such that the new string contains a repeating pattern of m 0’s and n 1’s.

Note:

No bit should be added or removed from the old string.

The new string starts with m 0’s.

The new string can end with m number of 0’s in the end without continuing the n number of 1’s in the string.

Constraints

1 <= t <= 1000

1 <=n,m <=1000

1 <= l <= 10000, where l is the length of the original string

Input Format

The first line of input contains t, which gives the number of test cases. Each test case contains three lines:

First line contains two space separated integers, m and n.

Second line contains l, the length of the string.

Third line contains the string containing 0’s and 1’s.

Output Format

Output contains t lines and each line contains a “YES” if the new string can be created and “NO” otherwise.

Sample Input

2
2 2
8
11101000
3 4
16
0110111000011111
Sample Output

YES
NO
Explanation

The first test case has the string 11101000. It has 4 1’s and 4 0’s. These can be used to create a repeating pattern of 2 0’s and 2 1’s (00110011).*/

import java.util.Scanner;


public class BitPattern {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String[] outArray = new String[t];
        for (int i = 0; i < t; i++) {
            int m = s.nextInt();
            int n = s.nextInt();
            int strLen = s.nextInt();
            String str = s.next();
            int noOfZeroes = 0;
            int noOfOnes = 0;

            if ((m+n)!=0 && strLen % (m + n) == 0) {
                int quot = strLen / (m + n);
                char[] charArray = str.toCharArray();

                for (int j = 0; j < charArray.length; j++) {
                    if (charArray[j] == '0') {

                        noOfZeroes++;
                    } else if (charArray[j] == '1') {
                        noOfOnes++;
                    }
                }

                if (quot * m == noOfZeroes && quot * n == noOfOnes) {
                    outArray[i] = "YES";
                } else {
                    outArray[i] = "NO";
                }

            } else {
                outArray[i] = "NO";
            }
        }

        for (int k = 0; k < outArray.length; k++) {
            System.out.println(outArray[k]);
        }


    }
}
