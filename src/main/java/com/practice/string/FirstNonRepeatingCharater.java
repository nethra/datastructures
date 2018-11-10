package com.practice.string;

public class FirstNonRepeatingCharater {

    //First non-repeating character using one traversal of string | Set 2
//Given a string, find the first non-repeating character in it.
// For example, if the input string is “teststring”, then output should be ‘e’ and if input string is “tester”, then output should be ‘s’


    public static void main(String[] args) {

        String str = "tester";

        for (int i = 0; i < str.length(); i++) {
            boolean matchfound = false;
            char c = str.charAt(i);
            for (int j = i + 1; j < str.length(); j++) {

                char ch = str.charAt(j);
                if (c == ch) {
                    matchfound = true;
                    break;
                }

            }
            if (!matchfound) {
                System.out.println(c);
                break;
            }

        }

    }
}

