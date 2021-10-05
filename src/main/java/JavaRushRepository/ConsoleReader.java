package JavaRushRepository;

import java.util.Scanner;

public class ConsoleReader {

    public static String readString () {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static int readInt() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static double readDouble() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    public static boolean readBoolean() {
        Scanner scanner = new Scanner(System.in);
        String booleanStr = scanner.nextLine();
            boolean flag = false;
            if (booleanStr.equals("true") || booleanStr.equals("TRUE") || booleanStr.equals("True")) {
                flag = true;
            } else if (booleanStr.equals("false") || booleanStr.equals("FALSE") || booleanStr.equals("False")) {
                flag = false;
            } else {
                System.out.println("Error, please input true or false");
            }
        return flag;
    }

    public static int MaxNumber() {
        int a = ConsoleReader.readInt();
        int max = 0;

        for (int i = 0; i <= a; i++) {
            int b = ConsoleReader.readInt();
                if (b >= max) {
                    max = b;
                }
        } return max;

    }




}
