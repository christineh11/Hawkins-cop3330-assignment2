package ex32;

import junit.framework.TestCase;

import java.util.Scanner;

public class MainTest extends TestCase {

    public void testRandom() {

        int rand;
        int counter = 0;
        int levelint = 1;

        rand = (int) (Math.random() * (Math.pow(10, levelint)) + 1);
        String guesser = "2";

            try {

                String guess = guesser;
                int guessint = Integer.valueOf(guess);
                if (rand == guessint) {
                    counter++;
                    System.out.println("You got it in " + counter + " guesses!\n");

                }
            } catch (RuntimeException ex) {
                System.out.print("Invalid input. Guess again:");
                counter++;
            }
        }
}
