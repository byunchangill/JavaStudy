package ch07;

class Point {
    int x;
    int y;
}

class Circle extends Point { // 상속
    int r;
}

class Circle1 { // 포함
    Point p = new Point(); // 참조변수의 초기화
    int r;
}

public class InheritanceTest {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.x = 1;
        c.y = 2;
        c.r = 3;

        System.out.println("c.x = " + c.x);
        System.out.println("c.y = " + c.y);
        System.out.println("c.r = " + c.r);

        Circle1 c1 = new Circle1();
        c1.p.x = 1;
        c1.p.y = 2;
        c1.r = 3;

        System.out.println("c1.p.x = " + c1.p.x);
        System.out.println("c1.p.y = " + c1.p.y);
        System.out.println("c1.r = " + c1.r);
    }
}
