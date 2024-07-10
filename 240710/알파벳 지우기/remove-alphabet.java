import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 첫 번째 문자열 입력
        String str1 = scanner.nextLine();
        // 두 번째 문자열 입력
        String str2 = scanner.nextLine();
        
        // 각 문자열에서 숫자 부분 추출하여 정수로 변환
        int num1 = extractNumber(str1);
        int num2 = extractNumber(str2);
        
        // 두 수의 합 계산
        int sum = num1 + num2;
        
        // 결과 출력
        System.out.println(sum);
    }
    
    // 문자열에서 숫자 부분 추출하여 정수로 변환하는 메소드
    private static int extractNumber(String str) {
        StringBuilder sb = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                sb.append(ch);
            }
        }
        String numStr = sb.toString();
        return Integer.parseInt(numStr);
    }
}