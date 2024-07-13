import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 스캐너 객체 생성하여 사용자 입력 받기
        Scanner scanner = new Scanner(System.in);
        
        // 수의 개수 n 입력받기
        int n = scanner.nextInt();
        
        // 모든 수의 합을 저장할 변수 초기화
        int sum = 0;
        
        // n개의 수를 입력받아 합을 계산
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            sum += num;
        }
        
        // 합을 문자열로 변환
        String sumStr = String.valueOf(sum);
        
        // 합의 결과를 좌측으로 한 칸 민다 (첫 번째 문자 제거하고 마지막에 '0' 추가)
        String shiftedResult = sumStr.substring(1) + sumStr.charAt(0);
        
        // 결과 출력
        System.out.println(shiftedResult);
        
        // 스캐너 객체 닫기
        scanner.close();
    }
}