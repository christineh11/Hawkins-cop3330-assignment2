package ex24;


import org.junit.Test;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Christine Hawkins
 */

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static boolean isAnagram(String str1, String str2) {

        boolean id = true;
        String s1 = str1;
        String s2 = str2;

        if (s1.length() != s2.length()) {
            id = false;
        } else {
            char[] ArrayStr1 = s1.toCharArray();
            char[] ArrayStr2 = s2.toCharArray();
            Arrays.sort(ArrayStr1);
            Arrays.sort(ArrayStr2);
            id = Arrays.equals(ArrayStr1, ArrayStr2);
        }
        if (id) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter two strings and I'll tell you if they are anagrams: ");
        System.out.print("Enter the first string: ");
        String str1=input.nextLine();

        System.out.print("Enter the second string: ");
        String str2=input.nextLine();
        if(isAnagram(str1,str2))
            System.out.printf("\"%s\" and \"%s\" are anagrams", str1,str2);
        else
            System.out.printf("\"%s\" and \"%s\" are not anagrams", str1,str2);


    }
}


