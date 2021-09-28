package ex32;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Christine Hawkins
 */

import java.util.Scanner;
import java.util.Random;
import org.junit.Test;


public class Main {

    public static void random() {


        Scanner input = new Scanner(System.in);

        int rand;
        int counter = 0;
        char ch = 'y';

        while (ch == 'y' || ch == 'Y') {


            System.out.print("Enter the difficulty level ( 1,2, or 3) : ");
            String level = (input.next());
            int levelint = Integer.valueOf(level);

            rand = (int) (Math.random() * (Math.pow(10, levelint)) + 1);
            System.out.print("I have my number. What's your guess? ");

            while (true) {

                try {

                    String guess = (input.next());
                    int guessint = Integer.valueOf(guess);
                    if (rand == guessint) {
                        counter++;
                        System.out.println("You got it in " + counter + " guesses!\n");
                        break;
                    } else if (rand > guessint) {
                        System.out.print("Too low. Guess again: ");
                        counter++;
                    } else if (rand < guessint) {
                        System.out.print("Too high. Guess again: ");
                        counter++;
                    }
                } catch (RuntimeException ex) {
                    System.out.print("Invalid input. Guess again:");
                    counter++;
                }
            }

            System.out.print("Do you wish to play again (Y/N)?\n");
            ch = input.next().charAt(0);
            counter = 0;
        }
        }

    public static void main(String[] args) {


        System.out.println("Lets play Guess Number!");
        random();


    }
}

