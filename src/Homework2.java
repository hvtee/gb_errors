import java.io.FileNotFoundException;
import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) throws Exception {

//        float number = inputFloat();
//        System.out.println(number);
//
//        task2();
//
//        task3();

        System.out.println("String: " + inputString());
    }

//    static float inputFloat() {
//        float num;
//        Scanner scanner = new Scanner(System.in);
//        while (true) {
//            try {
//                System.out.println("Input float: ");
//                num = scanner.nextFloat();
//                break;
//            } catch (Exception e) {
//                System.out.println("Exception: " + e.getClass().getSimpleName());
//                scanner.nextLine();
//            }
//        }
//        return num;
//    }

//    static void task2() throws Exception {
//        try {
//            int d = 0;
//            //added init of intArray
//            double[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//            double catchedRes1 = intArray[8] / d;
//
//            System.out.println("catchedRes1 = " + catchedRes1);
//        } catch (ArithmeticException e) {
//            System.out.println("Catching exception: " + e);
//        }
//    }

//    public static void task3() throws Exception {
//        try {
//            int a = 90;
//            int b = 3;
//            System.out.println(a / b);
//            printSum(23, 234);
//            int[] abc = {1, 2, 3, 4};
//            abc[3] = 9;
//        } catch (Throwable ex) {
//            System.out.println("Что-то пошло не так...");
//        }
//    }

//    public static void printSum(Integer a, Integer b) throws FileNotFoundException {
//        System.out.println(a + b);
//    }

    static String inputString() throws Exception {
        String str = "";
        Scanner scanner = new Scanner(System.in);

        str = scanner.nextLine();
        if (str.isEmpty()) {
            throw new Exception("Empty string!");
        }

        return str;
    }
}
