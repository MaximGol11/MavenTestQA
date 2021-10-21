package QaHomeworks.Homework13;

import QaHomeworks.Homework13.Employee;

import java.util.ArrayList;

public class Helper {
    //find an employee in an array by name
    public static String findByName(String name, ArrayList<Employee> employees){
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getName().equalsIgnoreCase(name)) {
                return employees.get(i).toString();
            }
        }
        return "no such user found";
    }
    //find an employee in an array by part of his name
    public static String findByPartName(String name, ArrayList<Employee> employees) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getName().contains(name)) {
                return employees.get(i).toString();
            }
        }
        return "employee not found";
    }
    //find an all employee in an array string concatenation
    public static String findByAllName(String name, ArrayList<Employee> employees){
        String allEmployee = "";
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getName().equalsIgnoreCase(name)) {
                allEmployee = allEmployee + employees.get(i).toString() + ", ";
            }
        }
        if (allEmployee.isEmpty()) {
            return "no such user found";
        }
       return allEmployee;
    }
    //find an all employee in an array, return array
    public static ArrayList<Employee> findByAllNameArray(String name, ArrayList<Employee> employees) {
        ArrayList<Employee> employeesName = new ArrayList<Employee>();
        for (int i =0; i < employees.size(); i++) {
            if (employees.get(i).getName().equalsIgnoreCase(name)) {
                employeesName.add(employees.get(i));
            }
        } return employeesName;
    }
    //return a sum salary
    public static int getSalarySum(ArrayList<Employee> employees) {
        int sum = 0;
        for (int i = 0; i < employees.size(); i++) {
            sum += employees.get(i).getSalary();
        }
        return sum;
    }
    //find a max salary in array

}

