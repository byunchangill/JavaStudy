package ch02;

public class VarEx4 {
    public static void main(String[] args) {
        int x = 10, y = 2;
        int tmp;

        tmp = x;
        x = y;
        y = tmp;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
