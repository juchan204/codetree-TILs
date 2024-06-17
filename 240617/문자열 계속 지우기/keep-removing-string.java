import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 문자열 A와 B 입력
        String A = sc.nextLine();
        String B = sc.nextLine();
        
        // B가 A에 존재할 때까지 반복
        while (A.contains(B)) {
            // B의 첫 번째 등장 위치 찾기
            int index = A.indexOf(B);
            
            // B를 제거한 새로운 문자열 생성
            A = A.substring(0, index) + A.substring(index + B.length());
        }
        
        // 최종 결과 출력
        System.out.println(A);
        
        sc.close();
    }
}