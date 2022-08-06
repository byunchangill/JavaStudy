package ch03;

public class IncrementOperator {
    public static void main(String[] args) {
        int i = 5, j = 0;

        j = i++; // 후위형
        System.out.println("j = i++; 실행 후, i = " + i + ", j = " + j);

        i = 5; // 결과를 비교하기 위해, i 와 j 의 값을 다시 5 와 0 으로 변경
        j = 0;

        j = ++i; // 전위형
        System.out.println("j = ++i; 실행 후, i = " + i + ", j = " + j);

        int ii = -10;
        ii = ii;
        System.out.println(ii);

        ii = -10;
        ii = -ii;
        System.out.println(ii);
    }
}
