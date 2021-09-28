package ex39;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Christine Hawkins
 */

import ex40.Record2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.function.Function;
import org.junit.Test;

public class Main {

        public static void main (String[]args)
        {
            Records[] record= {
                new Records("John", "Johnson", "Manager", new Date(2016, 12, 31)),
                new Records("Tou", "Xiong", "Software Engineer", new Date(2016, 10, 5)),
                new Records("Michaela", "Michaelson", "District Manager", new Date(2015, 12, 19)),
                new Records("Jake", "Jacobson", "Programmer", null),
                new Records("Jacquelyn", "Jockson", "DBA", null),
                new Records("Sally", "Webber", "Web Developer", new Date(2015, 12, 18))
        };


            List<Records> array = Arrays.asList(record);
            Function<Records, String> FirstName = Records::getFirstName;
            Function<Records, String> LastName = Records::getLastName;

            Comparator<Records> last = Comparator.comparing(LastName).thenComparing(FirstName);

            System.out.println("Name \t            |\tPosition\t           |\tSeparation Date");
            System.out.println("--------------------|--------------------------|----------------");

            array.stream().sorted(last).forEach(System.out::println);
        }
    }
