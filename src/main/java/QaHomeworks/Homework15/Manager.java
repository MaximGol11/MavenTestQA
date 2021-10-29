package QaHomeworks.Homework15;

public final class Manager extends BaseEmployee {
    private int countOfWorkers;

    public Manager(String name, int age, char sex, double salaryInDay, int countOfWorkers) {
        super(name, age, sex, salaryInDay);
        this.countOfWorkers = countOfWorkers;
    }

    public int getCountOfWorkers() {
        return countOfWorkers;
    }

    @Override
    public double getSalary(MonthUtils.Month[] monthsArray) {
        double sum = getSalaryInDay();
        int dayCount = 0;
        for (int i = 0; i < monthsArray.length; i++) {
            dayCount += monthsArray[i].getNumberOfWorkDays();
        }
        sum *= dayCount;
        return sum + getCountOfWorkers() / 100 * sum;
    }
}
