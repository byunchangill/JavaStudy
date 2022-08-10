package ch07;

public class AbstractTest2 {
    public static void main(String[] args) {
        Unit[] group = { new Marine(), new Tank(), new DropShip() };

        // Unit[] 배열을 풀어쓰면 아래와 같다.
//        Unit[] group = new Unit[3];
//        group[0] = new Marine();
//        group[1] = new Tank();
//        group[2] = new DropShip();

        for (int i = 0; i < group.length; i++) {
            group[i].move(100, 200);
        }
        // for 문 을 풀어쓰면 아래와 같다.
        // group 의 타입은 Unit[], group[0], group[1], group[2]의 타입은 Unit
//        group[0].move(100, 200); // Marine 객체의 move(100, 200)을 호출
//        group[1].move(100, 200); // Tank 객체의 move(100, 200)을 호출
//        group[2].move(100, 200); // DropShip 객체의 move(100, 200)을 호출
    }
}

abstract class Unit {
    int x, y;
    abstract void move(int x, int y);

    void stop() {
        System.out.println("현재 위치에 정지");
    }
}

class Marine extends Unit {

    @Override
    void move(int x, int y) {
        System.out.println("Marine[x = " + x + ", y = " + y + "]");
    }
    void stimPack() {
        System.out.println("스팀팩을 사용한다.");
    }
}

class Tank extends Unit {

    @Override
    void move(int x, int y) {
        System.out.println("Tank[x = " + x + ", y = " + y + "]");
    }
    void changeMode() {
        System.out.println("공격모드를 전환한다.");
    }
}

class DropShip extends Unit {

    @Override
    void move(int x, int y) {
        System.out.println("DropShip[x = " + x + ", y = " + y + "]");
    }
    void load() {
        System.out.println("선택된 대상을 태운다.");
    }

    void unload() {
        System.out.println("선택된 대상을 내린다.");
    }
}
