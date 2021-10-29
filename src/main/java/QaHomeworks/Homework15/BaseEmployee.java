package QaHomeworks.Homework15;

public abstract class BaseEmployee {
    private String name;
    private int age;
    private char sex;
    private double salaryInDay;

    public BaseEmployee(String name, int age, char sex, double salaryInDay) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.salaryInDay = salaryInDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public double getSalaryInDay() {
        return salaryInDay;
    }

    public void setSalaryInDay(double salaryInDay) {
        this.salaryInDay = salaryInDay;
    }
    public abstract double getSalary(MonthUtils.Month[] monthsArray);
}

