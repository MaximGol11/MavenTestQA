package QaHomeworks.Homework13;

public abstract class Employee {
    private String name;
    private int age;
    private double salary;
    private  int baseSalary = 3000;

    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "{" + getName() + ", " + getAge() + ", " + getSalary() + "}";
    }
}
