import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 스캐너 객체 생성하여 사용자 입력 받기
        Scanner scanner = new Scanner(System.in);
        
        // 두 정수를 공백을 기준으로 입력받기
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        
        // 두 수의 합 계산
        int sum = num1 + num2;
        
        // 합을 문자열로 변환
        String sumStr = String.valueOf(sum);
        
        // 숫자 '1'의 개수를 셀 변수 초기화
        int count = 0;
        
        // 문자열을 순회하며 '1'의 개수를 센다
        for (int i = 0; i < sumStr.length(); i++) {
            if (sumStr.charAt(i) == '1') {
                count++;
            }
        }
        
        // 결과 출력
        System.out.println(count);
        
        // 스캐너 객체 닫기
        scanner.close();
    }
}