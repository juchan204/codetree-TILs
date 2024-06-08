import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 첫 번째 줄 입력 받기
        String str1 = sc.nextLine();
        // 두 번째 줄 입력 받기
        String str2 = sc.nextLine();

        // 공백을 제거한 문자열 생성
        String result = str1.replace(" ", "") + str2.replace(" ", "");

        // 결과 출력
        System.out.println(result);
    }
}