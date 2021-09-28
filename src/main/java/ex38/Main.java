package ex38;


/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Christine Hawkins
 */

import java.util.ArrayList;
import java.util.Scanner;
import org.junit.Test;

public class Main {

    public static Integer[] filterEvenNumbers(String space[]) {

        ArrayList<Integer> array = new ArrayList<>();

        for (int i = 0; i < space.length; i++) {

            try {
                int value = Integer.parseInt(space[i]);
                if (value % 2 == 0) {
                    array.add(value);
                }
            } catch (NumberFormatException exception) {

            }

        }
        Integer[] arr = new Integer[array.size()];
        arr = array.toArray(arr);

        return arr;

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a list of numbers, separated by spaces: ");
        String num = input.nextLine();

        String space[] = num.split(" ");
        Integer even[] = filterEvenNumbers(space);

        System.out.print("The even numbers are: ");

        for (int i = 0; i < even.length; i++) {
            if (i < even.length) {
                System.out.print(even[i] + " ");
            }

        }
    }
}
