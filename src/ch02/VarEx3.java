package ch02;

public class VarEx3 {
    public static void main(String[] args) {
        // 변수, 상수 선언과 동시에 초기화 하는게 좋다.
        int score = 100;
        score = 200;
        System.out.println(score);

        final int score1 = 100;
//        score1 = 200; // final을 사용함으로써 변수가 상수로 변하여 값을 변경 할 수 잆다
        System.out.println(score1);

        int score2; //
//        score2 = 200;
//        System.out.println(score2); // 값을 초기화 하지 않고 값을 읽을 수 없다.

        boolean power = true;
        System.out.println(power); // true

//        boolean power1 = 0; // 타입 불일치 에러
//        System.out.println(power1);

        char ch = 'A';
        int i = 'A';
        String str = ""; // 빈 문자열
        String str1 = "ABCD";
        String str2 = "123";
        String str3 = str1 + str2;
        System.out.println(ch); // A
        System.out.println(i); // 65
        System.out.println(str3); // ABC123

        System.out.println("" + 7 + 7); // 77
        System.out.println(7 + 7 + ""); // 14
    }
}
