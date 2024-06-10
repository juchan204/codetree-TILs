import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 문자열 str을 입력받음
        String str = sc.next();
        // 정수 n을 입력받음
        int n = sc.nextInt();

        if (n > str.length()) {
            n = str.length();
        }

        // 문자열의 끝에서부터 n개의 문자를 출력
        for(int i = str.length() - 1; i >= str.length() - n ; i--) {
            System.out.print(str.charAt(i));
        }
    }
}