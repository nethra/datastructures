package com.practice.Miscellaneous;

/*Special Numbers
A special number is defined as a number where, in binary notation,

a. has only set bits (OR)

b. all set bits are followed by unset bits (OR)

c. the sequence formed by count of the number of set bits separated by any number of unset bits is a contiguous subsequence of the sequence of natural numbers.

2, 3, 11271 and 15667135 are special numbers because their binary represenation is 10, 11, 10110000000111 and 111011110000111110111111 respectively.

2 is a special number because of condition (b).

3 is a special number because of condition (a).

11271 is a special number because its binary representation is 10110000000111 because of condition (c). The sequence of the count of number
of set bits separated by a unset bits is 1, 2 and 3. This is clearly a continguous subsequence of the natural numbers.

Similarly, 15667135 is a special number. (The sequence is 3,4, 5 and 6.)

So, given two integers n and m where n <= m, find out the number of special numbers between n and m inclusive.

Input Format:

The first line of input contains an integer T where T is the number of test cases. Then T lines follow containing
two space separated integers n and m where n <= m.

Output Format:

For each test case, output, in different lines, a single integer P where P is the number of special numbers between the range specified.

Constraints:

1 <= T <= 1000

1 <= n <= 10^6

1 <= m <= 10^6

n <= m

Sample Input:

4
2 10
11 15
20 30
2 100
Sample Output:

6
4
5
43
Explanation:

1) For first test case 2 10 : Special numbers are 2 3 4 6 7 8 (6 Special numbers)

2) For second test case 11 15 : Special numbers are 11 12 14 15 (4 Special Numbers)

3) FOr third test case 20 30 : Special numbers are 22 23 24 28 30 (5 Special Numbers)

4) Similarly, in the fourth test cases, there are 43 special numbers in the range.*/

public class SpecialNumbers {
}
