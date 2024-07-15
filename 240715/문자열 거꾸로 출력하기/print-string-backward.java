import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 스캐너 객체 생성하여 사용자 입력 받기
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            // 문자열 입력 받기
            String input = scanner.nextLine();
            
            // 'END'가 주어지면 반복 종료
            if (input.equals("END")) {
                break;
            }
            
            // 문자열을 거꾸로 뒤집기
            String reversed = new StringBuilder(input).reverse().toString();
            
            // 뒤집은 문자열 출력
            System.out.println(reversed);
        }
        
        // 스캐너 객체 닫기
        scanner.close();
    }
}