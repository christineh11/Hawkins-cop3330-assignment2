package ex34;

import java.util.ArrayList;
import java.util.Arrays;


public class Employees {


    public static void printEmployees(ArrayList<String> employees) {
        System.out.println("There are " + employees.size() + " employees: ");
        for (String str : employees) {
            System.out.println(str);
        }

    }
}