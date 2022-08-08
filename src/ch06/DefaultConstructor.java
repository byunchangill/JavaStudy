package ch06;

public class DefaultConstructor {
    static class Data1 {
        int value;

//        Data1() {} // 기본생성자 .
        // 생성자가 하나도 없다면, 컴파일러가 기본생성자를 자동 추가 해준다.
    }

    static class Data2 {
        int value;

//        Data2() {} // 기본 생성자

        Data2(int x) {
            value = x;
        }
    }

    public static void main(String[] args) {
        Data1 d1 = new Data1();
//        Data2 d2 = new Data2(); // 컴파일러 에러. 기본생성자 작성해야 한다
        // The constructor Data2() is undefined
    }
}
