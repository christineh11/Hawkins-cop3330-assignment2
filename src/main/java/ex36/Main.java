package ex36;


/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Christine Hawkins
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.junit.Test;

public class Main {

    public static double  calculateAverage(List<Integer> array) {
        Integer sum = 0;
        if(!array.isEmpty()) {
            for (int mark : array) {
                sum += mark;
            }
            return sum.doubleValue() / array.size();
        }
        return sum;
    }

    public static double max(List<Integer> array)
    {
        int maximum = array.get(0);

        for(int num: array) {
            if(num > maximum)
                maximum = num;
        }
        return maximum;
    }

    public static double min(List<Integer> array)
    {
        int minimum= array.get(0);

        for(int num: array) {
            if(num < minimum)
                minimum = num;
        }
        return minimum;
    }

    public static double stdD(List<Integer> array)
    {
        double deviation= array.get(0);
        double sum= 0.0;

        for(double num : array) {
            sum += num;
        }

        double mean = sum/ array.size();

        for(double num: array) {
            deviation += Math.pow(num - mean, 2);
        }

        return Math.sqrt(deviation/ array.size());
    }



    public static void main(String[] args)  {

        ArrayList array=new ArrayList();

        Scanner input=new Scanner(System.in);
        String number;

        do
        {
            System.out.print("Enter a number: ");
            number = input.nextLine();
            try {
                int value = Integer.parseInt(number);
                array.add(value);
            }catch(NumberFormatException exception){

            }
        } while(!number.equals("done"));


        System.out.println("Numbers: "+(array));

        System.out.printf("The average is: %.1f\n", calculateAverage(array));
        System.out.println("The Maximum is: "+ Math.round(max(array)));
        System.out.println("The Maximum is: "+ Math.round(min(array)));
        System.out.printf("The Standard Deviation is: %.2f\n", stdD(array));

    }

}
