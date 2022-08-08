package ch07;

class MyPoint {
    int x;
    int y;
}

class Circle2 { // 포함
    Point p = new Point(); // 참조변수의 초기화
    int r;
}

public class ObjectEx {
    public static void main(String[] args) {
        Circle2 c2 = new Circle2();
        System.out.println(c2.toString()); // "Circle2@49e4cb85" 문자열 반환
        System.out.println(c2); // "Circle2@49e4cb85" 문자열 반환

        Circle2 c3 = new Circle2();
        System.out.println(c3.toString()); // "Circle2@2133c8f8" 문자열 반환
        System.out.println(c3); // "Circle2@2133c8f8" 문자열 반환

        // c3.toSting() 하나 c3 하나 결과값은 같다.
        // println 의 기능 중 하나로 println 에 참조변수가 들어오면 toSting 을 내부적으로 호출한다.
    }
}
