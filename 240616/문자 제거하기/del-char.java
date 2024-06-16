import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 문자열 입력
        String s = sc.nextLine();
        
        // 문자열이 하나 남을 때까지 반복
        while (s.length() > 1) {
            // 정수 입력
            int index = sc.nextInt();
            
            // 주어진 정수가 문자열의 길이 이상이면 마지막 문자 제거
            if (index >= s.length()) {
                index = s.length() - 1;
            }
            
            // 문자 제거 후 새로운 문자열 생성
            s = s.substring(0, index) + s.substring(index + 1);
            
            // 결과 출력
            System.out.println(s);
        }
        
        sc.close();
    }
}