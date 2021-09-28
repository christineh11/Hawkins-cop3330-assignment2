package ex35;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Christine Hawkins
 */

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import org.junit.Test;

public class Main {

    public static void main(String[] args)  {

            ArrayList array=new ArrayList();

            Random num= new Random();
            Scanner input=new Scanner(System.in);
        System.out.print("Enter a name: ");
        String name = input.nextLine();


while(!name.isEmpty())
{
    System.out.print("Enter a name: ");
     name = input.nextLine();
    array.add(name);
}
//removes blank space
    array.remove(array.size()-1);

        int index = num.nextInt(array.size());
        System.out.println("The winner is... " +array.get(index));

        }

    }