package ch04;

public class While {
    public static void main(String[] args) {
        int i = 5; // 반복 횟수

        while (i != 0) {
            i--;
            System.out.println(i);
        }

        int sum = 0;
        int j = 0;

        // i 를 1씩 증가시키면서 sum 에 계속 더해나간다.
        while (sum <= 100) {
            System.out.printf("%d - %d%n", j, sum);
            sum += ++j;
        }
    }
}
