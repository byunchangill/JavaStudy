package ch05;

public class Array {
    public static void main(String[] args) {
        int[] score;        // 1. 배열 score 선언(참조변수 선언)
        score = new int[5]; // 2. 배열의 생성(int 저장공간 X 5)

        int[] score1 = new int[5]; // 배열의 선언과 생성을 동시에
        score1[3] = 100;

        System.out.println("score[0] = " + score1[0]);
        System.out.println("score[1] = " + score1[1]);
        System.out.println("score[2] = " + score1[2]);
        System.out.println("score[3] = " + score1[3]);
        System.out.println("score[4] = " + score1[4]);

        int value = score1[3];
        System.out.println("value = " + value);
    }
}
