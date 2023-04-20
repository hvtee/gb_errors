public class Main {
    public static void main(String[] args) {
        int[] arr1 = null;
        System.out.println(showArray(arr1, 2));
        System.out.println(findElementIndex(arr1, 3, 3));

        int[][] arr2 = {
                {2, 3, 4},
                {3, 4, 5}
        };
        System.out.println(arr2.length + arr2[0].length);
    }

    public static int showArray(int[] arr, int limit) {
        if (arr == null || arr.length > limit) {
            return -1;
        }
        return arr.length;
    }

    public static int findElementIndex(int[] arr, int element, int minLength) {
        if (arr == null) {
            return -3;
        }
        if (arr.length < minLength) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return i;
            }
        }
        return -2;
    }

    public static int sumDoubleArray(int[][] array) {
        int sum = 0;

        if (array.length != array[0].length) {
            throw new RuntimeException("не квадратный массив");
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] != 0 || array[i][j] != 1) {
                    throw new RuntimeException("число не равно 0 или 1");
                }
                sum += array[i][j];
            }
        }

        return sum;
    }
}



