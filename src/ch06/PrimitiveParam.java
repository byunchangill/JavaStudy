package ch06;

class Data {
    int x;
}
// 기본형 매개변수
public class PrimitiveParam {
    // 1. PrimitiveParam 클래스가 메모리에 로드되고,
    // PrimitiveParam 클래스의 main 메서드가 호출되면서 프로그램 시작
    public static void main(String[] args) {
        // 2. Data 클래스가 메모리에 로드되고, Data 타입의 참조 변수 d 가 main 메서드의 지역변수로 생성된다.
        // Data 클래스의 인스터스가 생성되고, 생성된 인스턴스의 주소가 참조변수 d 에 저장된다.
        Data d = new Data();
        // 3. 참조변수 d 가 가리키고 있는(참조하고 있는) 인스턴스 멤버변수 x 에 10을 저장한다.
        d.x = 10;
        // 4. println 메서드를 호출해서 d.x 의 값을 출력한다.
        System.out.println("main() : x = " + d.x);
        // 5. change 메서드를 호출하면 매개변수로 참조변수 d 가 가리키고 있는 인스턴스의 맴버변수 x(d.x)의 값을 넘겨준다
        // d.x의 값인 1이 change 의 매개변수 x 에 복사된다.
        change(d.x);
        // 8. change 메서드의 수행이 끝났으므로 change 메서드가 사용하던 공간은 호출스텍에서 제거되고
        // 다시 main 메서드로 돌아가 change 를 호출한 다음 문장이 수행된다.
        System.out.println("After change(d.x)");
        // 9. println 메서드를 호출하여 d.x 의 값을 출력한다.
        // d.x 의 값은 10이므로 "main() : x = 10"을 출력한다.
        System.out.println("main() : x = " + d.x);
    }
    // 10. main 메서드의 마지막 문장까지 수행되었으므로 main 메서드가 종료되고
    // 동시에 전체 프로그램의 실행을 마치게 된다.

    static void change(int x) {  // 기본형 매개변수
        // 6. change 메서드의 지역변수 x 에 1000을 저장한다.
        x = 1000;
        // 7. println 메서드를 호출하여 x 의 값을 출력한다. x 의 값인 1000이 출력된다.
        System.out.println("change() : x = " + x);
    }
}