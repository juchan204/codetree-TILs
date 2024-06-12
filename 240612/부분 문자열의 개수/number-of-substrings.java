import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 첫 번째 줄에 문자열 A 입력
        String A = sc.nextLine();
        
        // 두 번째 줄에 문자열 B 입력
        String B = sc.nextLine();
        
        int count = 0;
        int lenA = A.length();
        int lenB = B.length();
        
        // 문자열 A를 순회하며 문자열 B가 일치하는지 확인
        for (int i = 0; i <= lenA - lenB; i++) {
            if (A.substring(i, i + lenB).equals(B)) {
                count++;
            }
        }
        
        // 결과 출력
        System.out.println(count);
    }
}