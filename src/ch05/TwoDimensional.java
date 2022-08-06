package ch05;

public class TwoDimensional {
    public static void main(String[] args) {

        int[][] score = {
                { 100, 100, 100},
                { 20, 20, 20},
                { 30, 30, 30},
                { 40, 40, 40}
        };

        int sum = 0;

        for (int i = 0; i < score.length; i++) { // 행(가로)
            for (int j = 0; j < score[i].length; j++) { // 열(세로)
                System.out.printf("score[%d][%d] = %d%n", i, j, score[i][j]);
                sum += score[i][j];
            }
        }
        System.out.printf("sum = " + sum);
    }
}
