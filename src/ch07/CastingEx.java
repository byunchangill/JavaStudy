package ch07;

public class CastingEx {
    public static void main(String[] args) {
        Car car = null;
        FireEngine f = new FireEngine();
        FireEngine f1 = null;

        f.water();
        car = f;    // car = (Car) f;
//        car.water(); // 에러. Car 타입의 참조변수인 car 로는 water() 사용불가.
        f1 = (FireEngine) car; // 자손타입 <- 조상타입.
        f1.water();
    }
}

class Car {
    String color;
    int door;

    void drive() {  // 운전하는 기능
        System.out.println("drive, Brrrr~~");
    }

    void stop() { // 멈추는 기능
        System.out.println("stop!!");
    }
}

class FireEngine extends Car {
    void water() { // 물 뿌리는 기능
        System.out.println("water!!!");
    }
}
