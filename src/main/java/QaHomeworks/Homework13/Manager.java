package QaHomeworks.Homework13;

import java.util.ArrayList;

public class Manager extends Worker {
    private static final int ALLOWANS = 3000;
    private static int countOfManagers;
    public static ArrayList<Employee> managers = new ArrayList<Employee>();
    private int numberOfSubordinates;


    public Manager(String name, int age, double salary, int numberOfSubordinates) {
        super(name, age, salary);
        this.numberOfSubordinates = numberOfSubordinates;
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

   //не понимаю задание, смотреть разбор
    @Override
    public double getSalary() {
        if (getNumberOfSubordinates() > 0) {
            return getBaseSalary() + getNumberOfSubordinates() * ALLOWANS;
        } else {
            return getBaseSalary();
        }
    }

}
