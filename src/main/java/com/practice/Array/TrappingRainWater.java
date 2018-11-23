package com.practice.Array;

public class TrappingRainWater {

    public static void main(String[] args) {

        int[] height = {1, 5, 2, 3, 1, 7, 2};
        int leftMax = 0;
        int rightMax = 0;
        int sum = 0;

        // int[] leftArray = new int[height.length];

        int[] rightArray = new int[height.length];

      /*  for (int i = 0; i < height.length; i++) {
            if (leftMax < height[i]) {
                leftMax = height[i];
            }

            leftArray[i] = leftMax;
        }*/

        for (int i = height.length - 1; i >= 0; i--) {
            if (rightMax < height[i]) {
                rightMax = height[i];
            }

            rightArray[i] = rightMax;
        }

        for (int i = 0; i < height.length; i++) {

            if (leftMax < height[i]) {
                leftMax = height[i];

            }
            sum = sum + (Math.min(leftMax, rightArray[i]) - height[i]);

        }

        System.out.println(sum);
    }
}
