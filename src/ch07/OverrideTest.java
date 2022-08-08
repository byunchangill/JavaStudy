package ch07;

class Point1 {
    int x;
    int y;

    String getLocation() {
        return "x : " + x + ", y : " + y;
    }
}

class Point3D extends Point1 {
    int z;
    @Override
    String getLocation() { // 조상의 getLocation()을 오버라이딩
        return "x : " + x + ", y : " + y + ", z : " + z;
    }

    public String toString() {
        return "x : " + x + ", y : " + y + ", z : " + z;
    }
}

public class OverrideTest {
    public static void main(String[] args) {
        Point3D p = new Point3D();
        p.x = 3;
        p.y = 5;
        p.z = 7;
        System.out.println(p.getLocation()); // overriding 호출

        System.out.println(p); // toString 호출
    }
}
