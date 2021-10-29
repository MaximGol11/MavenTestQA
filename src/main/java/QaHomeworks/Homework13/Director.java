package QaHomeworks.Homework13;

public class Director extends Manager {
    public static final int ALLOWANS = 10000;
    public Director(String name, int age, int salary, int numberOfSubordinates) {
        super(name, age, salary, numberOfSubordinates);
    }

    @Override
    public double getSalary() {
        if (getNumberOfSubordinates() > 0) {
            return getBaseSalary() + getNumberOfSubordinates() * ALLOWANS;
        } else {
            return getBaseSalary();
        }
    }
}
