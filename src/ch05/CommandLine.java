package ch05;

public class CommandLine {
    public static void main(String[] args) {
        // 1. edit configurations 로 들어간다
        // 2. program arguments 에 값을 입력한다.
        // 3. 실행
        System.out.println("매개변수의 개수 : " + args.length);

        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "] = \""+ args[i] + "\"");
        }
    }
}
