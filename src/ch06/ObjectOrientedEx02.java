package ch06;

public class ObjectOrientedEx02 {
    public static void main(String[] args) {
        Tv t1 = new Tv();
        Tv t2 = new Tv();

        System.out.println("t1.channel 값은 " + t1.channel + " 입니다.");
        System.out.println("t2.channel 값은 " + t2.channel + " 입니다.");

        t1.channel = 7;
        System.out.println("t1.channel 값을 7로 변경하였습니다.");

        System.out.println("t1.channel 값은 " + t1.channel + " 입니다.");
        System.out.println("t2.channel 값은 " + t2.channel + " 입니다.");
    }

   static class Tv {
        // Tv 의 속성(멤버변수)
        String color; // 색상
        boolean power; // 전원상태(on/off)
        int channel; // 채널

        // Tv 의 기능(메서드)
        void power() { power = !power; } // TV 를 켜거나 끄는 기능의 메서드
        void channelUp() { ++channel; } // TV 의 채널을 높이는 메서드
        void channelDown() { --channel; } // TV 의 채널을 낮추는는 메서드
    }
}
