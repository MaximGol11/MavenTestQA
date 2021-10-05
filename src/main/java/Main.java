public class Main {

    public static int getSum(int a, int b) {
        return a + b;
    }

    public static int getSub(int a, int b) {
        return a - b;
    }

    public static int getMultple(int a, int b) {
        return a * b;
    }

    public static  double getDiv(double a, double b) {
        if ( b == 0) {
            System.out.checkError();
        }
        return a / b;
    }
}
