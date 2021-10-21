package QaHomeworks.Homework13;

import java.util.ArrayList;

public class Worker extends Employee {

    private static int workersCount;
    public static ArrayList<Worker> workers = new ArrayList<Worker>();

    public Worker(String name, int age, int salary) {
        super(name, age, salary);
        workersCount++;
        workers.add(Worker.this);
    }

    public static int getWorkersCount() {
        return workersCount;
    }



}
