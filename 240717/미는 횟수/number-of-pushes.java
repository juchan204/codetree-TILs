import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 스캐너 객체 생성하여 사용자 입력 받기
        Scanner scanner = new Scanner(System.in);
        
        // 문자열 A와 B 입력받기
        String A = scanner.nextLine();
        String B = scanner.nextLine();
        
        // 문자열 길이
        int length = A.length();
        
        // 가능한 최솟값을 찾기 위해 n을 1부터 length까지 증가시키면서 확인
        for (int n = 1; n <= length; n++) {
            // A를 우측으로 n번 밀기
            String shiftedA = shiftRight(A, n);
            
            // 밀린 결과가 B와 같으면 n 출력 후 프로그램 종료
            if (shiftedA.equals(B)) {
                System.out.println(n);
                scanner.close();
                return;
            }
        }
        
        // 가능하지 않으면 -1 출력
        System.out.println(-1);
        
        // 스캐너 객체 닫기
        scanner.close();
    }
    
    // 문자열을 우측으로 n번 미는 메소드
    public static String shiftRight(String str, int n) {
        int length = str.length();
        // 실제 밀어야 하는 칸 수를 계산 (전체 길이에서 n을 뺀 값)
        n = n % length;
        // 오른쪽 부분과 왼쪽 부분을 나누어 결합
        return str.substring(length - n) + str.substring(0, length - n);
    }
}