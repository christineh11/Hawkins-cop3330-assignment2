package ex34;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.Arrays;

public class EmployeesTest extends TestCase {

    public void testPrintEmployees() {

        ArrayList employees=new ArrayList(Arrays.asList("John Smith","Jackie Jackson",
                "Chris Jones","Amanda Cullen","Jeremy Goodwin"));
       Employees.printEmployees(employees);
    }
}