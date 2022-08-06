package ch05;

public class ArrayEx01 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        System.out.println("arr.length = " + arr.length);

        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }
}
