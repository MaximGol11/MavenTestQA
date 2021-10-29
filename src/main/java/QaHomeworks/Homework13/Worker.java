package QaHomeworks.Homework13;

import java.util.ArrayList;

public class Worker implements IEmployee {
    private String name;
    private int age;
    private double salary;
    private  int baseSalary = 3000;
    private static int workersCount;
    public static ArrayList<Worker> workers = new ArrayList<Worker>();

    public Worker(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public int getBaseSalary() {
        return baseSalary;
    }

    @Override
    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public double getSalary() {
        return getBaseSalary();
    }
}
