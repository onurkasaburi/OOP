package Exam2;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        Employee employee = new Employee();
        Employee employee2 = new Employee("Mucahit A.", 100000, "September2015");
        employee.setName("Onur K.");
        employee.setSalary(80000);
        employee.setStartDate("October2019");

//        System.out.println(employee);
//        System.out.println("==========");
//        System.out.println(employee2);

        List<Employee> employees = new ArrayList<Employee>();
        employees.add(employee);
        employees.add(employee2);

//        for(int i = 0; i < employees.size(); i++){
//            System.out.println(employees.get(i));
//            System.out.println("============");
//
//        }

        for(Employee e : employees){
            System.out.println(e);
            System.out.println("==========");
        }
    }
}
