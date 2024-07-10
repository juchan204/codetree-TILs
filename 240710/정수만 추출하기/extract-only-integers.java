import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        // 공백을 기준으로 입력을 분리
        String[] parts = input.split(" ");
        String A = parts[0];
        String B = parts[1];
        
        // A에서 숫자로 변환 가능한 부분 찾기
        int numA = extractAndConvertToInt(A);
        
        // B에서 숫자로 변환 가능한 부분 찾기
        int numB = extractAndConvertToInt(B);
        
        // 합 계산 및 출력
        int sum = numA + numB;
        System.out.println(sum);
    }
    
    // 문자열에서 숫자로 변환 가능한 부분 추출하여 정수로 변환하는 메소드
    private static int extractAndConvertToInt(String str) {
        StringBuilder sb = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                sb.append(ch);
            } else {
                break; // 숫자 이외의 문자가 나오면 중단
            }
        }
        String numStr = sb.toString();
        return Integer.parseInt(numStr);
    }
}