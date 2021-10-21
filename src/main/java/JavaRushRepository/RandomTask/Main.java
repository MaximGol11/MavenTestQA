package JavaRushRepository.RandomTask;


import JavaRushRepository.RandomTask.Cat;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Vaska1", 3, 4, 10);
        Cat cat2 = new Cat("Vaska2", 3, 4, 10);
        Cat cat3 = new Cat("Vaska3", 3, 4, 10);
        Cat cat4 = new Cat("Vaska4", 3, 4, 10);
        Cat cat5 = new Cat("Vaska5", 3, 4, 10);
        Cat cat6 = new Cat("Vaska6", 3, 4, 10);
        Cat cat7 = new Cat("Vaska7", 3, 4, 10);
        Cat cat8 = new Cat("Vaska8", 3, 4, 10);
        Cat cat9 = new Cat("Vaska9", 3, 4, 10);

        System.out.println(Cat.getCatCount());
        Cat.printCats();
    }
}
