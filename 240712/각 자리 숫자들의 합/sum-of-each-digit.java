import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 스캐너 객체 생성하여 사용자 입력 받기
        Scanner scanner = new Scanner(System.in);
        
        // 정수 n 입력받기
        int n = scanner.nextInt();
        
        // 각 자리 숫자들의 합을 구할 변수 초기화
        int sum = 0;
        
        // n을 문자열로 변환
        String nStr = String.valueOf(n);
        
        // 문자열을 순회하며 각 자리 숫자들의 합을 구한다
        for (int i = 0; i < nStr.length(); i++) {
            // 각 자리 숫자를 정수로 변환하여 sum에 더한다
            sum += Character.getNumericValue(nStr.charAt(i));
        }
        
        // 결과 출력
        System.out.println(sum);
        
        // 스캐너 객체 닫기
        scanner.close();
    }
}