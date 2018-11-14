package com.practice.string;

public class OccurencesOfCharInAStr {
    public static void main(String[] args) {
        String str = "Today is monday";
        char[] ch = str.toCharArray();
        int counter =0;
        for(int i=0; i< ch.length; i++)
        {
            if(ch[i] == 'a')
            {
                counter++;
            }
        }

        System.out.println(counter);
    }
}
