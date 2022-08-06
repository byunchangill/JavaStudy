package ch04;

public class RandomInteger {
    public static void main(String[] args) {
        int num = 0;

        // 괄호{} 안의 내용을 5번 반복한다.
        // 1 ~ 10 사이의 임의의 정수
        for (int i = 1; i <= 5; i++) {
            num = (int) (Math.random() * 10) + 1;
            System.out.println(num);
        }

        System.out.println();

        // 괄호{} 안의 내용을 5번 반복한다.
        // -5 ~ 5 사이의 임의의 정수
        for (int i = 1; i <= 5; i++) {
            num = (int) (Math.random() * 11) - 5;
            System.out.println(num);
        }
    }
}
