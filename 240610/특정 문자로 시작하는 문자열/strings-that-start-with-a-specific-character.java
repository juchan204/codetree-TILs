import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 첫 번째 줄에서 정수 n을 입력받음
        int n = sc.nextInt();
        sc.nextLine(); // 개행 문자 소비

        // n개의 문자열을 저장할 배열 선언
        String[] strings = new String[n];

        // n개의 문자열을 입력받아 배열에 저장
        for (int i = 0; i < n; i++) {
            strings[i] = sc.nextLine();
        }

        // 마지막 줄에서 알파벳 소문자를 입력받음
        char targetChar = sc.next().charAt(0);

        // 조건에 맞는 문자열의 개수와 길이 합을 계산할 변수 선언
        int count = 0;
        int lengthSum = 0;

        // 배열을 순회하며 조건에 맞는 문자열을 찾음
        for (int i = 0; i < n; i++) {
            if (strings[i].charAt(0) == targetChar) {
                count++;
                lengthSum += strings[i].length();
            }
        }

        // 길이의 평균을 소수점 둘째자리까지 반올림하여 계산
        double averageLength = (double) lengthSum / count;
        System.out.printf("%d %.2f\n", count, averageLength);
    }
}