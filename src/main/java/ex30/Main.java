package ex30;


import java.util.Scanner;
import org.junit.Test;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Christine Hawkins
 */


public class Main {

    public static void Multiplication()
    {
        int rows = 12;
        int columns= 12;

        int i;
        for( i = 1;i<=rows;i++){
            for(int j = 1;j<=rows;j++){
                int total=i*j;
                System.out.printf("%4d", total);
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {

       Multiplication();


    }
}
