package ch02;

public class TypeConversion {
    public static void main(String[] args) {
        String str = "3";

        System.out.println(str.charAt(0) - '0'); // "3" -> '3'으로 바뀐 후 '3' - '0' => 숫자 3 으로 변환
        System.out.println('3' - '0' + 1); // 문자 '3' 을 숫자 3 으로 변환 후 1 을 더한다
        System.out.println(Integer.parseInt("3") + 1); // 문자열 "3" 을 숫자로 변환 후 1 을 더한다
        System.out.println("3" + 1); // 문자열 "3" 에서 1을 붙여 문자열 "31"이 된다.
        System.out.println(3 + '0'); // '0' 은 숫자로 48, 문자랑 숫자를 더할 수 없다
        System.out.println((char) (3 + '0')); // 형 변환을 해야 문자 '3'으로 변환 가능
    }
}
