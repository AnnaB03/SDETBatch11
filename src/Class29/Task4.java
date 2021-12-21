package Class29;

import java.util.HashMap;
import java.util.Map;

public class Task4 {
    //Create a Map that will store Employee name and salary.
    // Write a logic to retrieve an employee who gets the highest salary.
    // Output should be in the below format
     //John Smith=$100000
    public static void main(String[] args) {
        HashMap<String,Integer> employeeMap = new HashMap<>();
        employeeMap.put("John",120000);
        employeeMap.put("Jane",130000);
        employeeMap.put("Jon",110000);
        employeeMap.put("Smith",110000);
        String maxSalaryEmpName="";
        int macSalary = 0;

        for (Map.Entry<String,Integer> emp:employeeMap.entrySet()
             ) {
            if (emp.getValue()>macSalary) {
                macSalary=emp.getValue();
                maxSalaryEmpName=emp.getKey();
            }

        }
        System.out.println(maxSalaryEmpName+" =$"+macSalary);
    }



    }

