package JavaRushRepository;

import java.util.ArrayList;

public class Cat {

    public static ArrayList<Cat> cats = new ArrayList<Cat>();
    private static int catCount;

    private String name;
    private int age;
    private int weight;
    private int strength;


    public Cat(String name, int age, int weight, int strength) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.strength = strength;
        Cat.catCount++;
        cats.add(Cat.this);
    }

    public static int getCatCount() {
        return catCount;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public int getStrength() {
        return strength;
    }

    public static void setCatCount(int catCount) {
        Cat.catCount = catCount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public boolean catFight(Cat enemyCat) {
        boolean result = false;
        if (enemyCat.strength > getStrength() & enemyCat.weight > getWeight() & enemyCat.age < getAge()) {
            result = false;
        } else if (enemyCat.strength < getStrength() & enemyCat.weight < getWeight() & enemyCat.age < getAge()) {
            result = true;
        } else if (enemyCat.strength == getStrength() & enemyCat.weight < getWeight() & enemyCat.age < getAge()) {
            result = true;
        } else if (enemyCat.strength > getStrength() & enemyCat.weight == getWeight() & enemyCat.age < getAge()) {
            result = false;
        } else if (enemyCat.strength > getStrength() & enemyCat.weight > getWeight() & enemyCat.age == getAge()) {
            result = false;
        } else if (enemyCat.strength > getStrength() & enemyCat.weight < getWeight() & enemyCat.age == getAge()) {
            result = true;
        }
        return result;
    }

    public static void printCats() {
        for (int i = 0; i < cats.size(); i++) {

        }
    }
}
