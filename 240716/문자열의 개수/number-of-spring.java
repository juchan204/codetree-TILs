import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 스캐너 객체 생성하여 사용자 입력 받기
        Scanner scanner = new Scanner(System.in);

        // 최대 200개의 문자열을 저장할 배열 생성
        String[] strings = new String[200];
        int count = 0;
        
        while (true) {
            // 문자열 입력 받기
            String input = scanner.nextLine();
            
            // '0'이 주어지면 반복 종료
            if (input.equals("0")) {
                break;
            }
            
            // 배열에 문자열 추가
            strings[count] = input;
            count++;
        }
        
        // 입력받은 모든 문자열의 개수 출력
        System.out.println(count);
        
        // 홀수 번째 문자열 출력 (1-based index)
        for (int i = 0; i < count; i += 2) {
            System.out.println(strings[i]);
        }
        
        // 스캐너 객체 닫기
        scanner.close();
    }
}