package ex31;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Christine Hawkins
 */


import java.util.Scanner;
import org.junit.Test;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        while (true) {

            try {
                System.out.print("What is heart rate? ");
                String heartrate = (input.next());
                int heartrateint = Integer.valueOf(heartrate);

                System.out.print("What is your age? ");
                String age = (input.next());
                int ageint = Integer.valueOf(age);

                if (heartrateint > 0 & ageint>0) {
                    TargetHeartRate rate= new TargetHeartRate();

                    rate.RateCalculator(ageint,heartrateint);
                    break;

                }}
            catch(NumberFormatException exception) //catch invalid number exception
            {
                System.out.println("Sorry. That's not a valid input");
            }
        }

    }
}


