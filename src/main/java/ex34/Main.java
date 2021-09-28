package ex34;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Christine Hawkins
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import org.junit.Test;

public class Main {
    public static void main(String[] args) {
       ArrayList employees=new ArrayList(Arrays.asList("John Smith","Jackie Jackson",
                "Chris Jones","Amanda Cullen","Jeremy Goodwin"));


        Employees array= new Employees();
       array.printEmployees(employees);

        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter an employee name to remove: ");
        String name = input.nextLine();

        employees.remove(name);

        System.out.println();
        array.printEmployees(employees);
    }

}
