package ch04;

import java.util.Scanner;

public class NestingIfElse {
    public static void main(String[] args) {
        int score = 0;
        char grade = ' ', opt = ' ';

        System.out.println("점수를 입력해주세요");

        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt(); // 화면을 통해 입력받은 점수를 score 에 저장

        System.out.printf("당신의 점수는 %d 입니다.%n", score);

        if (score >= 90) {              // score 가 90보다 같거나 크면 A학점(grade)
            grade = 'A';
            if (score >= 98) {          // 90점 이상 중에서도 98점 이상은 A+
                opt = '+';
            } else if (score < 94) {    // 90점 이상 95점 이하는 A-
                opt = '-';
            }
        } else if (score >= 80) {
            grade = 'B';
            if (score >= 88) {
                opt = '+';
            } else if (score < 84) {
                opt = '-';
            }
        } else if (score >= 70) {
            grade = 'C';
            if (score >= 78) {
                opt = '+';
            } else if (score < 74) {
                opt = '-';
            }
        } else if (score >= 60) {
            grade = 'D';
            if (score >= 68) {
                opt = '+';
            } else if (score < 64) {
                opt = '-';
            }
        } else {
            grade = 'F';
        }

        System.out.printf("당신의 학점은 %c%c 입니다.%n", grade, opt);
    }
}
