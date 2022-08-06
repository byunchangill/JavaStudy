package ch04;

import java.util.Scanner;

public class IfElseIf {
    public static void main(String[] args) {
        int score = 0; // 점수를 저장하기 위한 변수, 0으로 초기화 한다.
        char grade = ' '; // 학점을 저장하기 위한 변수, 공백으로 최기화 한다.

        System.out.println("점수를 입력하세요");
        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt(); // 화면을 통해 입력받은 숫자를 score 에 저장

        if (score >= 90) {          // score 가 90점 보다 같거나 크면 A학점
            grade = 'A';
        } else if (score >= 80) {   // score 가 80점 보다 같거나 크면 B학점
            grade = 'B';
        } else if (score >= 70) {   // score 가 70점 보다 같거나 크면 C학점
            grade = 'C';
        } else {                    // 나머지는 D학점
            grade ='D';
        }

        System.out.println("당신의 학점은 " + grade + " 입니다.");
    }
}
