package ex27;

import java.util.Scanner;


/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Christine Hawkins
 */

public class Main {

    public static boolean Validateinput(String first, String last)
    {

        int n = first.length();
        if ( first.isEmpty()) {
            System.out.println("The first name must be filled in.");
            System.out.println("The first name must be at least 2 characters long.");
            return false;
        }
        else if(n<2)
            System.out.println("The first name must be at least 2 characters long.");


        int b = last.length();
        if ( last.isEmpty())
        {
            System.out.println("The last name must be filled in.");
             System.out.println("The last name must be at least 2 characters long.");
             return false;
        }
        else if(b<2)
            System.out.println("The last name must be at least 2 characters long.");


        return true;
    }


    public static boolean Validatezip(String zip) {
        if (zip == null || zip.length() != 5) {
            System.out.println("The zipcode must be a 5 digit number");
            return false;
        }
        for (int i = 0; i < zip.length(); i++) {
            char c = zip.charAt(i);
            if (Character.isLetter(c)) {
                System.out.println("The zipcode must be a 5 digit number");
                return false;

            }
        }
        return true;
    }

    public static boolean verifyID(String id) {

        if (id == null || id.length() != 7) {
            System.out.println("The employee ID must be in the format of AA-1234");
            return false;
        }
        else
        {
            System.out.println("There were no errors found.");
        }
            for (int i = 0; i < 2; i++) {
                char c = id.charAt(i);
                if (Character.isUpperCase(c)) // true if upper case letter, false if not
                {
                    return true;

                } else {
                    System.out.println("The employee ID must be in the format of AA-1234");
                    return false;
                }
            }

            for (int i = 3; i < id.length(); i++) {
                char c = id.charAt(i);
                if (c == '-') // true if upper case letter, false if not
                {
                    return true;

                } else {
                    System.out.println("The employee ID must be in the format of AA-1234");
                    return false;
                }
            }

            for (int i = 4; i < id.length(); i++) {
                char c = id.charAt(i);
                if (Character.isDigit(c)) // true if upper case letter, false if not
                {
                    System.out.println("No errors found");
                    return true;

                } else {
                    System.out.println("The employee ID must be in the format of AA-1234");
                    return false;
                }

        }

        return true;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter the first name: ");
        String first=input.nextLine();

        System.out.print("Enter the last name: ");
        String last=input.nextLine();

        System.out.print("Enter the zipcode: ");
        String zip=input.nextLine();

        System.out.print("Enter the employee ID: ");
        String ID=input.nextLine();

        Validateinput(first,last);

        Validatezip(zip);
        verifyID(ID);


    }
}

