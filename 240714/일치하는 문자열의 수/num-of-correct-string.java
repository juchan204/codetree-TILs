import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 스캐너 객체 생성하여 사용자 입력 받기
        Scanner scanner = new Scanner(System.in);
        
        // 첫 번째 줄에 정수 n과 문자열 A를 공백으로 구분하여 입력받기
        int n = scanner.nextInt();
        String targetString = scanner.next();
        
        // 문자열 A와 일치하는 문자열의 개수를 셀 변수 초기화
        int count = 0;
        
        // n개의 문자열을 입력받아 비교
        for (int i = 0; i < n; i++) {
            String inputString = scanner.next();
            if (inputString.equals(targetString)) {
                count++;
            }
        }
        
        // 결과 출력
        System.out.println(count);
        
        // 스캐너 객체 닫기
        scanner.close();
    }
}