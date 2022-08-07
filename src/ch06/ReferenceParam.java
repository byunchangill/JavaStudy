package ch06;

class Data2 { int x; }
// 참조형 매개변수
public class ReferenceParam {
    // 1. ReferenceParam 클래스가 메모리에 로드되고,
    // PrimitiveParam 클래스의 main 메서드가 호출되면서 프로그램 시작
    public static void main(String[] args) {
        // 2. Data 클래스가 메모리에 로드되고, Data 타입의 참조변수 d 가 main 메서드의 지역변수로 생성
        // Data 클래스의 인스턴스가 생성되고, 생성된 인스턴스의 주소가 참조변수 d 에 저장
        Data2 d = new Data2();
        // 3. 참조변수 d 가 가리키고 있는(참조하고 있는)인스턴스의 맴버변수 x 에 10을 저장
        d.x = 10;
        // 4. println 메서드를 호출해서 d.x 의 값을 출력한다.
        System.out.println("main() : x = " + d.x);

        // 5. change 메서드를 호출하면서 매개변수로 참조변수 d 를 넘겨준다
        // main 메서드의 참조변수 d 의 값(Data 인스턴스의 주소)은 change 메서드의 매개변수 d 에 복사된다.
        change(d);
        // 8. change 메서드의 수행이 끝났으므로 change 메서드가 사용하던 공간은 호출스택에서 제거되고,
        // 다시 main 메서드로 돌아가 change 를 호출한 후, 다음 문장이 수행된다.
        System.out.println("After change(d)");
        // 9. println 메서드를 호출하여 d.x 의 값을 출력한다.
        // d.x 의 값은 1000이므로 "main() : x = 1000"을 출력한다.
        System.out.println("main() : x = " + d.x);
    }
    // 10. main 메서드의 마지막 문장까지 수행되었으므로 main 메서드가 종료되고
    // 동시에 전체 프로그램의 실행을 마치게 된다.

    static void change(Data2 d) { // 참조형 매개변수
        // 6. change 메서드의 지역변수인 참조변수 d 가 가리키고 있는 인스턴스의 맴버변수 x 에 1000을 저장
        d.x = 1000;
        // 7. println 메서드를 호출해서 d.x 의 값을 출력한다.
        System.out.println("change() : x = " + d.x);
    }
}
