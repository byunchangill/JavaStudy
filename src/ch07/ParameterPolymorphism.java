package ch07;

class Product {
    int price;
    int bonusPoint;

    Product(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0); // 보너스점수는 제품가격의 10%
    }
}

class Tv1 extends Product {
    Tv1() {
        // 조상클래스의 생성자 Product(int price)를 호출한다.
        super(100); // Tv의 가격을 100으로 한다.
    }

    public String toString() {
        return "Tv1";
    }
}

class Computer extends Product {
    Computer() {
        super(200);
    }

    public String toString() {
        return "Computer";
    }
}

class Buyer { // 고객, 물건을 사는 사람
    int money = 1000; // 소유금액
    int bonusPoint = 0; // 보너스 점수

    void buy(Product p) {
        if (money < p.price) {
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
            return;
        }

        money -= p.price; // 가진 돈에서 구입한 제품의 가격을 뺀다.
        bonusPoint += p.bonusPoint; // 제품의 보너스 점수를 추가한다.
        System.out.println(p+ "을/를 구입하셨습니다.");
    }
}

public class ParameterPolymorphism {
    public static void main(String[] args) {
        Buyer b = new Buyer();

        Product p = new Tv1();
        b.buy(p);
//        b.buy(new Tv1()); // 위 두줄을 한 줄로 표현. 객체 생성 후 바로 넘겨주기.
        b.buy(new Computer());

        System.out.println("현재 남은 돈은 " + b.money + " 입니다.");
        System.out.println("현재 보너스 점수는 " + b.bonusPoint + " 입니다.");
    }
}
