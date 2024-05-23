import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 첫 번째 줄 입력 처리
        int n = sc.nextInt();
        
        // 두 번째 줄 입력 처리 (n개의 숫자)
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        // 2가 3번째로 등장하는 위치 찾기
        int count = 0;
        int position = -1;

        for (int i = 0; i < n; i++) {
            if (numbers[i] == 2) {
                count++;
                if (count == 3) {
                    position = i + 1; // 1-based 인덱스
                    break;
                }
            }
        }

        // 결과 출력
        System.out.println(position);

        sc.close();
    }
}