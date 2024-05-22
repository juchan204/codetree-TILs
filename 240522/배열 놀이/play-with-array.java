import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 정수 n과 q를 입력받습니다.
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] arr = new int[n];
        
        // n개의 원소를 입력받습니다.
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // q개의 질의를 처리합니다.
        for(int i = 0; i < q; i++) {
            int queryType = sc.nextInt();
            if (queryType == 1) {
                // "1 a": a번째 원소를 출력합니다.
                int a = sc.nextInt();
                System.out.println(arr[a - 1]);
            } else if (queryType == 2) {
                // "2 b": 값이 b인 원소를 찾아 위치를 출력합니다.
                int b = sc.nextInt();
                int position = 0;
                for (int j = 0; j < n; j++) {
                    if (arr[j] == b) {
                        position = j + 1;
                        break;
                    }
                }
                System.out.println(position);
            } else if (queryType == 3) {
                // "3 s e": s번째 원소부터 e번째 원소까지 출력합니다.
                int s = sc.nextInt();
                int e = sc.nextInt();
                for (int j = s - 1; j < e; j++) {
                    System.out.print(arr[j] + " ");
                }
                System.out.println();
            }
        }
    }
}