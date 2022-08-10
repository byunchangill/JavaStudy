package ch07;

class Time {
    private int hour; // 0 ~ 23 사이의 값을 가져야 함
    private int minute;
    private int second;

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour < 0 || hour > 23) {
            return;
        }
        this.hour = hour;
    }
}

public class TimeTest {
    public static void main(String[] args) {
        Time t = new Time();
//        t.hour = -100;
        t.setHour(21);
        System.out.println(t.getHour());

        t.setHour(100);
        System.out.println(t.getHour());
    }
}
