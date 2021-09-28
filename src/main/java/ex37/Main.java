package ex37;


/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Christine Hawkins
 */

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import org.junit.Test;

public class Main {

    public static String generatePassword(int length, int characters, int numbers)
    {
        int index;

        String letters = "abcdefghijklmnopqrstuvwxyz";
        String special = "!@#$%^&*?";
        String num = "1234567890";
        String password = "";

        Random random = new Random();

        ArrayList<Character> array = new ArrayList<>();

        for(int i=array.size(); i<length; i++){

             index = random.nextInt(letters.length());
            array.add(letters.charAt(index));
        }

        for(int i=0; i<characters; i++){
            index = random.nextInt(special.length());
            array.add(special.charAt(index));
        }

        for(int i=0; i<numbers; i++){

            index = random.nextInt(num.length());
            array.add(num.charAt(index));
        }

        for(char str : array)
        {
            password += Character.toString(str);
        }

        return password;
    }


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.print("What is the minimum length? ");
        int length = input.nextInt();

        System.out.print("How many special characters? ");
        int characters = input.nextInt();

        System.out.print("How many numbers? ");
        int numbers = input.nextInt();

        System.out.println("Your password is: "+ generatePassword(length,characters,numbers));


    }
}
