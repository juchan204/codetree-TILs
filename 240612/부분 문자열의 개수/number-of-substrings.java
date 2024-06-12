import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 첫 번째 줄에 문자열 A 입력
        String A = sc.nextLine();
        
        // 두 번째 줄에 문자열 B 입력
        String B = sc.nextLine();
        
        // 문자열 B의 길이는 2로 가정
        int count = 0;
        int index = 0;
        
        // 문자열 A에서 문자열 B를 찾기
        while ((index = A.indexOf(B, index)) != -1) {
            count++;
            index += B.length();  // 찾은 위치 이후부터 다시 검색
        }
        
        // 결과 출력
        System.out.println(count);
    }
}