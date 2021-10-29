package QaHomeworks.Homework13;

public class Main {
    public static void main(String[] args) {
        Manager manager1 = new Manager("Andrew", 21, 10000, 10);
        Manager manager2 = new Manager("Anna", 35, 7000, 50);
        Manager manager3 = new Manager("Sergey", 30, 4000, 5);
        Manager manager4 = new Manager("Anton", 34, 5000, 15);
        Manager manager5 = new Manager("Anna", 25, 3500, 10);

        //System.out.println(Helper.findByName("Anna", Manager.managers));
        //System.out.println(Helper.findByAllName("Ann", Manager.managers));
        //System.out.println(Helper.findByAllNameArray("Anna", Manager.managers).toString());
        System.out.println(manager1.getSalary());
        //System.out.println(Helper.getSalarySum(Manager.managers));
    }
}
