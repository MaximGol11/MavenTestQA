package QaHomeworks.Homework15;

public final class Employee extends BaseEmployee {

    public Employee(String name, int age, char sex, double salaryInDay) {
        super(name, age, sex, salaryInDay);
    }

    public double getSalary(MonthUtils.Month[] monthsArray) {
        double sum = getSalaryInDay();
        int dayCount = 0;
        for (int i = 0; i <monthsArray.length; i++) {
            dayCount += monthsArray[i].getNumberOfWorkDays();
        }
        sum *= dayCount;
        return sum;
    }
}
