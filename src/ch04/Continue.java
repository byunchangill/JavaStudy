package ch04;

public class Continue {
    public static void main(String[] args) {
        for(int i = 0; i <= 10; i++) {
            if(i % 3 == 0) {        // 조건식이 참이 되어 continue 문이 수행되면
                continue;           // 블럭의 끝으로 이동한다.
            }                       // break 문과 달리 반복문을 벗어나지 않는다.
            System.out.println(i);
        }
    }
}
