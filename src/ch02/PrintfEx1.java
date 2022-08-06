package ch02;

public class PrintfEx1 {
    public static void main(String[] args) {
        // 10/3 -> 정수/정수 => 정수
        System.out.println(10/3);

        // 10.0/3 -> 실수/정수 or 정수/실수 or 실수/실수 => 실수
        System.out.println(10.0/3);

        // 10, 8, 16 진수
        System.out.printf("%d%n", 15);
        System.out.printf("%o%n", 15);
        System.out.printf("%x%n", 15);

        // 접두사 붙이기
        System.out.printf("%#o%n", 15);
        System.out.printf("%#x%n", 15);

        // 2진수 지시자는 없다 메소드 이용
        System.out.printf("%s%n", Integer.toBinaryString(15));

        // 실수 출력 지시자
//        float f = 123.456789f;
        double f = 123.456789;
        System.out.printf("%f%n", f);
        System.out.printf("%e%n", f);
        System.out.printf("%g%n", f);

        System.out.printf("[%5d]%n", 10);  // [   10]
        System.out.printf("[%-5d]%n", 10); // [10   ]
        System.out.printf("[%05d]%n", 10); // [00010]
    }
}
