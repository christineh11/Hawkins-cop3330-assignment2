package ex33;

import junit.framework.TestCase;

import java.util.Random;
import java.util.Scanner;

public class MainTest extends TestCase {

    public void testMain() {

        String question= "Is today a lucky day?";

        Random random=new Random();
        String[] answers = {"Yes","No","Maybe","Ask again later"};

        int index = random.nextInt(answers.length);

        question= answers[index];

        System.out.println(question);


    }


}
