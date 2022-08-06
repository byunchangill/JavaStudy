package ch05;

import java.util.Arrays;

public class ArraysEx {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4};
        int[][] arr2D = { {11, 12}, {21, 22} };

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.deepToString(arr2D));

        String[][] str2D = new String[][] { {"aaa", "bbb"}, {"AAA", "BBB"} };
        String[][] str2D2 = new String[][] { {"aaa", "bbb"}, {"AAA", "BBB"} };

        System.out.println(Arrays.deepEquals(str2D, str2D2));

        int[] arr2 = Arrays.copyOf(arr, arr.length);
        int[] arr3 = Arrays.copyOf(arr, 3);
        int[] arr4 = Arrays.copyOf(arr, 7);
        int[] arr5 = Arrays.copyOfRange(arr, 2, 4);
        int[] arr6 = Arrays.copyOfRange(arr, 0, 7);

        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));
        System.out.println(Arrays.toString(arr5));
        System.out.println(Arrays.toString(arr6));

        int[] arr7 = {3, 2, 0, 1, 4};
        Arrays.sort(arr7);
        System.out.println(Arrays.toString(arr7));
    }
}
