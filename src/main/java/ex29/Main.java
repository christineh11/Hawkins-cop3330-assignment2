package ex29;


import java.util.Scanner;
import org.junit.Test;


/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Christine Hawkins
 */


public class Main {


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        while (true) {

            try {
                System.out.print("What is the rate of return?");
                String value = (input.next());
                int valueint = Integer.valueOf(value);
                if (valueint > 0) {
                    int years = 72 / valueint;
                    System.out.printf("It will take %d years to double your initial investment", years);
                    break;

                }}
                catch(NumberFormatException exception) //catch invalid number exception
                {
                    System.out.println("Sorry. That's not a valid input");
                }
            }

        }
    }

