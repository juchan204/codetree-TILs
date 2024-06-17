import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 문자열 입력
        String input = sc.nextLine();
        
        // 첫 번째 'e'의 위치 찾기
        int index = input.indexOf('e');
        
        // 'e'를 제거한 새로운 문자열 생성
        String result = input.substring(0, index) + input.substring(index + 1);
        
        // 결과 출력
        System.out.println(result);
        
        sc.close();
    }
}