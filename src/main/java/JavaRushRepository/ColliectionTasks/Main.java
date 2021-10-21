package JavaRushRepository.ColliectionTasks;

import JavaRushRepository.RandomTask.Cat;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Cat> mapCats = new HashMap<String, Cat>();
        mapCats.put("1", new Cat("Vaska", 1, 4, 10));
        mapCats.put("2", new Cat("Vaska1", 1, 4, 10));
        mapCats.put("3", new Cat("Vaska2", 1, 4, 10));
        mapCats.put("4", new Cat("Vaska3", 1, 4, 10));

        for (Map.Entry<String, Cat> pair: mapCats.entrySet()) {
            String key = pair.getKey();
            Cat value = pair.getValue();
            System.out.println(key + " : " + value.toString());
        }



    }
}
