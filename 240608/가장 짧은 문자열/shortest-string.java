import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 세 문자열 입력 받기
        String str1 = sc.next();
        String str2 = sc.next();
        String str3 = sc.next();

        // 각 문자열의 길이 계산
        int len1 = str1.length();
        int len2 = str2.length();
        int len3 = str3.length();

        // 가장 긴 문자열의 길이 찾기
        int maxLength = Math.max(len1, Math.max(len2, len3));

        // 가장 짧은 문자열의 길이 찾기
        int minLength = Math.min(len1, Math.min(len2, len3));

        // 가장 긴 문자열과 가장 짧은 문자열의 길이 차이 계산 및 출력
        System.out.println(maxLength - minLength);
    }
}