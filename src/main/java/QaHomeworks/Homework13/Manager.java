package QaHomeworks.Homework13;

import java.util.ArrayList;

public class Manager extends Worker {
    private static int countOfManagers;
    public static ArrayList<Employee> managers = new ArrayList<Employee>();
    private int numberOfSubordinates;


    public Manager(String name, int age, int salary, int numberOfSubordinates) {
        super(name, age, salary);
        this.numberOfSubordinates = numberOfSubordinates;
        countOfManagers++;
        managers.add(Manager.this);
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public ArrayList<Employee> getManager() {
        return managers;
    }

   //через инт не могу, нужно все переделывать на дабл, но мне лень
    @Override
    public double getSalary() {
        if (getNumberOfSubordinates() > 0) {
            double a = (10.0 / 100.0 * 3.0 * 3000.0);
            System.out.println(a);
            return getBaseSalary() + a;
        } else {
            return getBaseSalary();
        }
    }

}
