import java.util.Arrays;
import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        // Err1
//        int num1 = getNumber();
//        System.out.println(num1);

        //Err2
//        int[] array1 = {1, 2, 3, 4};
//        printArray(array1);

        //Err3
//        int[] array2 = null;
//        int[] array3 = addArray(array2);
//        System.out.println(Arrays.toString(array3));
        int[] a = {3, 2, 1, 4}, b = {2, 5, 11};
        int[] res = sumElementsArray(a, b);

        if (res == null) throw new RuntimeException("Null in res");

        for (int element : res) {
            System.out.println(element);
        }

    }

    // InputMismatchException
    static int getNumber() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input number");
        return scanner.nextInt();
    }

    // ArrayIndexOutOfBoundsException
    static void printArray(int[] arr) {
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }
    }

    // NullPointerException
    static int[] addArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 2;
        }

        return arr;
    }

    static int[] sumElementsArray(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            System.out.println("Diff arrays length");
            return null;
        }

        int[] res = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            res[i] = arr1[i] + arr2[i];
        }
        return res;
    }
}

