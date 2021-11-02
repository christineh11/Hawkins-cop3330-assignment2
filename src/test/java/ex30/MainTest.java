package ex30;

import junit.framework.TestCase;

public class MainTest extends TestCase {

    public void testMultiplication_lastnum() {

       int expectedOutput= 144;

        int rows = 12;
        int columns= 12;
        int total=0;

        int i;
        for( i = 1;i<=rows;i++){
            for(int j = 1;j<=rows;j++){
                total=i*j;
                System.out.printf("%4d", total);
            }
            System.out.println();
        }


        assertEquals(expectedOutput,total);


    }
}