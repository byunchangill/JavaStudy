package ch07;

abstract class Unit2 {
    int x, y;
    abstract void move(int x, int y);
    void stop() {
        System.out.println("멈춥니다.");
    }
}

interface FightAble { // 모든 인터페이스의 메서드는 public abstract
    void move(int x, int y); // public abstract 생략
    void attack(FightAble f); // public abstract 생략
}

class Fighter extends Unit2 implements FightAble {
    public void move(int x, int y) { // 오버라이딩 규칙 : 조상보다 접근제어자 범위가 좁으면 안된다.
        System.out.println("[" + x + ", " + y + "]로 이동");
    }
    public void attack(FightAble f) {
        System.out.println(f + "를 공격");
    }

    FightAble getFightAble() { // 싸울 수 있는 상대를 불러온다.
        Fighter f = new Fighter();
        return f;
    }
}

public class ImplementsTest {
    public static void main(String[] args) {
        Fighter f = new Fighter();
        f.move(100, 200);
        f.attack(new Fighter());
        FightAble f2 = f.getFightAble();
    }
}
