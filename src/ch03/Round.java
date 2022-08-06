package ch03;

public class Round {
    public static void main(String[] args) {
        double pi = 3.141592;

        System.out.println(pi);
        System.out.println(pi * 1000);
        System.out.println(Math.round(pi * 1000));
        System.out.println(Math.round(pi * 1000)/1000);
        System.out.println(Math.round(pi * 1000)/1000.0);

        System.out.println((int)(pi * 1000)/1000.0); // 3.141 로 봐꾸기

        int x = 10, y = 8;

        System.out.printf("%d 을 %d 로 나누면, %n", x, y); // 10 을 8 로 나누면,
        System.out.printf("몫은 %d 이고, 나머지는 %d 입니다.%n", x / y, x % y); // 몫은 1 이고, 나머지는 2 입니다.
    }
}
