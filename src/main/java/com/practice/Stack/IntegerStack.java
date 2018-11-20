package com.practice.Stack;

public class IntegerStack {

    int maxLimit;
    private int[] stackArray;
    int top;
    int maxNum=0;

    public int getMaxLimit() {
        return maxLimit;
    }

    IntegerStack(int max) {
        maxLimit = max;
        top = -1;
        stackArray = new int[maxLimit];
    }

    public void push(int val)
    {

        if(top == maxLimit-1)
        {
            System.out.println("Stack overflow");
            return;
        }
        if(val > maxNum)
        {
            maxNum = val;
        }
        stackArray[++top] = val;
    }

    public  int pop() {
        if (top == -1) {
            System.out.println("Stack underflow");
            return -1;
        }
        return stackArray[top--];
    }

    public  int peek() {
        if (top == -1) {
            System.out.println("Stack underflow");
            return -1;
        }
        return stackArray[top];
    }

    public  int Max() {

        return maxNum;
    }


    public static void main(String[] args) {

        IntegerStack st = new IntegerStack(10);
        st.push(100);
        st.push(130);
        st.push(30);
        st.push(90);
        st.push(50);
        st.push(60);
        System.out.println(st.maxNum);



    }
}
