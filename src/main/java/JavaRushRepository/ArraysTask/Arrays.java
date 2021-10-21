package JavaRushRepository.ArraysTask;

import java.util.ArrayList;

import static JavaRushRepository.RandomTask.ConsoleReader.readInt;
import static JavaRushRepository.RandomTask.ConsoleReader.readString;

public class Arrays {

    // returns an int array where each number is equal to the number of characters in the string
    // в консоль пишем строки разной длины и заполняем массив числами с длинами введенных строк
    public static void twoArrays() {
        String[] stringList = new String[10];
        int[] intList = new int[10];

        for (int i = 0; i < 10; i++) {
            stringList[i] = readString();
        }
        for (int j = 0; j < stringList.length; j++) {
            intList[j] = stringList[j].length();
        }
        System.out.println(java.util.Arrays.toString(intList));
    }

    // обрабатывает только четные числа, на нечетных падает от того что результат деления нечетного числа
    // округляется в меньшую сторону, а два массива имеют одинаковую длину
    // и второй массив не может вместить все переданные числа
    // можно добавить условие: либо передавать только четную длину массива либо как-то доработать, чтобы вмещало
    public static void cutBigArray(int arrayLength) {
        int[] list = new int[arrayLength];

        int halfArrayLength = arrayLength / 2;

        int[] halfList1 = new int[halfArrayLength];
        int[] halfList2 = new int[halfArrayLength];

        for (int i = 0; i < arrayLength; i++) {
            list[i] = readInt();
        }
        for (int j = 0; j < halfArrayLength; j++) {
            halfList1[j] = list[j];
        }
        int k1 = 0;
        for (int k = halfArrayLength; k < arrayLength; k++) {
            halfList2[k1] = list[k];
            k1 += 1;
        }

        System.out.println(java.util.Arrays.toString(list));
        System.out.println(" ");
        System.out.println(java.util.Arrays.toString(halfList1));
        System.out.println(" ");
        System.out.println(java.util.Arrays.toString(halfList2));


    }

    //find the biggest string in array and print all string with equals length
    public static void findMaxString (int arrayLength) {
        ArrayList<String> list = new ArrayList<String>();
        int maxSize = 0;
        for (int i = 0; i < arrayLength; i++) {
            String s = readString();
            list.add(s);
        }
        for (int j = 0; j < list.size(); j++) {
            String s = list.get(j);
            if (s.length() >= maxSize) {
                maxSize = s.length();
            }
        }
        for (int k = 0; k < list.size(); k++) {
            String s = list.get(k);
            if (maxSize == s.length()) {
                System.out.println(list.get(k));
            }
        }
    }

    //find the min string in array and print all string with equals length
    public static void findMinString (int arrayLength) {
        ArrayList<String> list = new ArrayList<String>();
        int minSize = 1;
        for (int i = 0; i < arrayLength; i++) {
            String s = readString();
            list.add(s);
        }
        for (int j = 0; j < list.size(); j++) {
            String s = list.get(j);
            String s0 = list.get(0);
            if (s.length() < s0.length()) {
                minSize = s.length();
            }
        }
        for ( int k = 0; k < list.size(); k++) {
            String s = list.get(k);
            if (minSize == s.length()) {
                System.out.println(list.get(k));
            }
        }
    }

    //upper case all input strings and print input string as many times as string length
   // public static void


}
