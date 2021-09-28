package ex33;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Christine Hawkins
 */

import java.util.Scanner;
import java.util.Random;
import org.junit.Test;

public class Main {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("What's your question? ");
        String question= input.next();

        Random random=new Random();
        String[] answers = {"Yes","No","Maybe","Ask again later"};

        int index = random.nextInt(answers.length);

       question= answers[index];
        System.out.println(question);


    }
}
