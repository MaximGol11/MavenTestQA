package QaHomeworks.Homework13;

public class Director extends Manager {
    public Director(String name, int age, int salary, int numberOfSubordinates) {
        super(name, age, salary, numberOfSubordinates);
    }

    @Override
    public double getSalary() {
        if (getNumberOfSubordinates() > 0) {
            return getBaseSalary() + getNumberOfSubordinates() / 100 * 9;
        } else {
            return getBaseSalary();
        }
    }
}
