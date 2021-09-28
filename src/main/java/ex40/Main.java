package ex40;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Christine Hawkins
 */




import java.util.*;
import java.util.function.Function;
import org.junit.Test;

public class Main {

    public static void main (String[]args)
    {
        Record2[] record= {
                new Record2("John", "Johnson", "Manager", new Date(2016, 12, 31)),
                new Record2("Tou", "Xiong", "Software Engineer", new Date(2016, 10, 5)),
                new Record2("Michaela", "Michaelson", "District Manager", new Date(2015, 12, 19)),
                new Record2("Jake", "Jacobson", "Programmer", null),
                new Record2("Jacquelyn", "Jockson", "DBA", null),
                new Record2("Sally", "Webber", "Web Developer", new Date(2015, 12, 18))
        };

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a search string: ");
        String next = input.nextLine();
        System.out.println("\nResults:\n");

        System.out.println("Name \t            |\tPosition\t         |\tSeparation Date");
        System.out.println("--------------------|------------------------|----------------");


        for(Record2 r: record) {
            String temp;
            if(r.separationdate == null) temp = "";
            else  temp = r.separationdate.toString();
            if(r.Firstname.contains(next) || r.Lastname.contains(next))
                System.out.printf("%-20s | %-20s | %-20s\n",  r.Firstname + " " +
                        r.Lastname, r.position, temp);
        }

    }
}
