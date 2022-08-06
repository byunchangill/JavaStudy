package ch05;

import java.util.Arrays;

public class ArrayEx02 {
    public static void main(String[] args) {
        int[] iArr = {100, 95, 80, 70, 60};
        System.out.println(iArr);

        // for 문을 이용한 모든 요소 출력
        for (int i = 0; i < iArr.length; i++) {
            System.out.println(iArr[i]);
        }

        // Arrays.toString 을 이용한 모든 요소 출력 (문자열로 출력된다)
        System.out.println(Arrays.toString(iArr));
    }
}
