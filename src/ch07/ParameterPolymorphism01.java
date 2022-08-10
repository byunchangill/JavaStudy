package ch07;

class Product2 {
    int price;
    int bonusPoint;

    Product2(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0); // 보너스점수는 제품가격의 10%
    }
}

class Tv2 extends Product2 {
    Tv2() {
        // 조상클래스의 생성자 Product(int price)를 호출한다.
        super(100); // Tv의 가격을 100으로 한다.
    }

    public String toString() {
        return "Tv2";
    }
}

class Computer2 extends Product2 {
    Computer2() {
        super(200);
    }

    public String toString() {
        return "Computer2";
    }
}

class Audio2 extends Product2 {
    Audio2() {
        super(50);
    }

    public String toString() {
        return "Audio2";
    }
}

class Buyer2 { // 고객, 물건을 사는 사람
    int money = 1000; // 소유금액
    int bonusPoint = 0; // 보너스 점수
    Product2[] cart = new Product2[10]; // 구입한 제품을 저장하기 위한 배열
    int i = 0;  // Product2 배열에 사용될 카운터

    void buy(Product2 p) {
        if (money < p.price) {
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
            return;
        }

        money -= p.price; // 가진 돈에서 구입한 제품의 가격을 뺀다.
        bonusPoint += p.bonusPoint; // 제품의 보너스 점수를 추가한다.
        cart[i++] = p; // 제품을 Product[] cart 에 저장한다.
        System.out.println(p+ "을/를 구입하셨습니다.");
    }

    void summary() {    // 구입한 물품에 대한 정보를 요약해서 보여 준다.
        int sum = 0;    // 구입한 물품의 가격 합계
        String itemList = "";   // 구입한 물품 목록

        // 반복문을 이용해서 구입한 물품의 총 가격과 목록을 만든다.
        for (int i = 0; i < cart.length; i++) {
            if (cart[i] == null) {
                break;
            }
            sum += cart[i].price;
            itemList += cart[i] + ", ";
        }
        System.out.println("구입하신 물품의 총금액은 " + sum + "만원입니다.");
        System.out.println("구입하신 제품은 " + itemList + "입니다.");
    }
}

public class ParameterPolymorphism01 {
    public static void main(String[] args) {
        Buyer2 b = new Buyer2();

        Product2 p = new Tv2();
        b.buy(p);
//        b.buy(new Tv1()); // 위 두줄을 한 줄로 표현. 객체 생성 후 바로 넘겨주기.
        b.buy(new Computer2());
        b.buy(new Audio2());
        b.summary();
    }
}