package ex35;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MainTest extends TestCase {

    public void testMain() {

        ArrayList array=new ArrayList();

        Random num= new Random();
        String name = "Christine";
        array.add(name);

        int index = num.nextInt(array.size());
        System.out.println("The winner is... " +array.get(index));

        assertEquals(0,index);

    }

}