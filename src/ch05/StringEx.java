package ch05;

public class StringEx {
    public static void main(String[] args) {

        String str = "ABCDE";
        char ch = str.charAt(4);
        System.out.println(ch);
        System.out.println(str.length());

        String str2 = str.substring(1, 4);
        System.out.println(str2);
    }
}
