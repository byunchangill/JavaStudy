package ch04;

public class NestedLoop {
    public static void main(String[] args) {
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9 ; j++) {
                System.out.println(i + " + " + j + " = " + ( i * j ));
            }
            System.out.println();
        }

        // 별찍기
        for (int i = 1; i <= 5 ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
