/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Christine Hawkins
 */

import java.util.Scanner;


    public class Main {

        public static void main(String[] args) {

            Scanner input= new Scanner(System.in);
            System.out.println("What is the input string?");

            String theinput= input.nextLine();

            System.out.printf("%s has %d characters.", theinput, theinput.length());
            ;    }
    }
