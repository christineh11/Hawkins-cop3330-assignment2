package ex28;

import java.util.Scanner;
import org.junit.Test;


/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Christine Hawkins
 */


public class Main {

    public static void total()
    {
        Scanner input= new Scanner(System.in);
        int number =0;
        for (int i=0; i<5; i++)
        {
            System.out.print("Enter a number: ");
            number+=input.nextInt();
        }
        System.out.println("The total is: " +number);

    }

    public static void main(String[] args) {

        total();

    }
}
