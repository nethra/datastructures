package com.practice.Queue;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class Queue {

    int maxLimit;
    int[] queueArray;
    int top;

    public void Enqueue(int data)
    {
        if(top == maxLimit-1)
        {
            System.out.println("queue is full");
            return;
        }

        queueArray[++top] =data;
    }

    public int Dequeue()
    {
        if(top==-1)
        {
            System.out.println("Queue is Empty");
            return 0;
        }
        int frontElement = queueArray[0];
        for(int i=0; i< queueArray.length-1; i++)
        {
            queueArray[i] = queueArray[i+1];
        }
        top--;
        return frontElement ;
    }

    public Queue(int maxValue)
    {
        maxLimit = maxValue;
        queueArray = new int[maxLimit];
        top = -1;

    }
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.Enqueue(1);
        q.Enqueue(2);
        q.Enqueue(3);
        System.out.println(q.Dequeue());
        q.Enqueue(4);
        q.Enqueue(5);
        System.out.println(q.Dequeue());

    }
}
