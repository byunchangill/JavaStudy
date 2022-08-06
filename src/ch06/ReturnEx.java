package ch06;

public class ReturnEx {
    public static void main(String[] args) {
        Math math = new Math();
        math.printGugudan(6);
    }
}

class Math {
    void printGugudan(int dan) {
        if (!(2 <= dan && dan <= 9)) {
            return; // 입력받은 단(dan)이 2 ~ 9가 아니면, 메서드 종료하고 돌아가기
        }

        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d * %d = %d%n", dan, i, dan * i);
        }
//        return; // 생력 가능
    }
}
