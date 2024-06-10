import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 문자열 str을 입력받음
        String str = sc.next();
        // 정수 n을 입력받음
        int n = sc.nextInt();

        // str의 길이가 n보다 작으면 런타임 에러가 발생할 수 있으므로 조건을 추가
        if (n > str.length()) {
            System.out.println("Error: n is larger than the length of the string.");
            return;
        }

        // 문자열의 끝에서부터 n개의 문자를 출력
        for(int i = str.length() - 1; i >= str.length() - n ; i--) {
            System.out.print(str.charAt(i));
        }
    }
}