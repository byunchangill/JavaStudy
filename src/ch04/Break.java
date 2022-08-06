package ch04;

public class Break {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;

        while (true) { // 무한 반복문 === for(;(true 생략가능);) {}
            if(sum > 100) {
                break; // 자신이 속한 하나의 반복문을 벗어난다.
            }
            ++i;        // break 문이 수행되면 이 부분은 실행되지
            sum += i;   // 않고 while 문을 완전히 벗어난다.
        }

        System.out.println("i = " + i);
        System.out.println("sum = " + sum);
    }
}
