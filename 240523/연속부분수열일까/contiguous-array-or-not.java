import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 첫 번째 줄 입력 처리
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        
        // 두 번째 줄 입력 처리 (수열 A)
        int[] A = new int[n1];
        for (int i = 0; i < n1; i++) {
            A[i] = sc.nextInt();
        }
        
        // 세 번째 줄 입력 처리 (수열 B)
        int[] B = new int[n2];
        for (int i = 0; i < n2; i++) {
            B[i] = sc.nextInt();
        }

        // 연속 부분 수열인지 확인
        boolean isSubsequence = false;

        for (int i = 0; i <= n1 - n2; i++) {
            boolean match = true;
            for (int j = 0; j < n2; j++) {
                if (A[i + j] != B[j]) {
                    match = false;
                    break;
                }
            }
            if (match) {
                isSubsequence = true;
                break;
            }
        }

        // 결과 출력
        if (isSubsequence) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }
}