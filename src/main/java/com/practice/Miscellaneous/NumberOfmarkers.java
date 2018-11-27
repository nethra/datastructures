package com.practice.Miscellaneous;

public class NumberOfmarkers {

  /*  Number of Markers
    In a metro city in United States there is a long road with markers on it after each 1 metre. There is a big International School whose vehicles are parked on the road in front of the school.

    Let’s say there are N vehicles standing on road. You are given the starting and the end point of each vehicle standing on the road. (both inclusive.)

    You have to find the number of markers that is covered by at least one vehicle. A vehicle with starting point X and end point Y is considered to be present on a marker M if X <= M <= Y.

    Note that this is a parallel parking lot. The markers cover the whole lot. And it is possible for multiple vehicles to overlap. (That is suppose a vehicle is parked from starting point X to end point Y. It is possible for another vehicle to be parked parallely from A to B where X<=A<=Y) As mentioned the markers cover the whole lot.

    Input:

    The first line of input consists of an integer T (number of test cases). Each test case consists of the following:

    The first line of test case consists of an integer N.
    This is followed by N lines with two space separated integers X and Y in each line. X represents the starting position and Y the ending position as described above.
            Output:

    For each test case, print a single integer which is the count of the number of markers with at least one vehicle in separate lines.

            Constraints:

            0 < T < 1000

            0 < N < 10000

            -32768 < X,Y < 32767

    Sample Input

2
        3
        4 7
        -1 5
        3 6
        2
        1 4
        8 13
    Sample Output

9
        10
    Explanation

    For the first test case, we have at least one vehicle standing at markers (-1,0,1,2,3,4,5,6,7); so output is 9.*/


  
}
