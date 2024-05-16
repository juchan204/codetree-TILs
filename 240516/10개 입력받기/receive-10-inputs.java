import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 정수 배열 선언
        int[] arr = new int[10];
        int cnt = 0;
        int sum = 0;

        // 10개의 정수를 배열에 입력받으며 0이 있는지 확인합니다.
        for(int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] == 0)
                break;
            cnt++;

        }

        // 0이 입력되기 전까지의 수를 반대 순서로 출력합니다.
        for(int i = 0; i < cnt; i++) {
            sum += arr[i];
        }
        System.out.printf("%d %.1f",sum,(double)sum/cnt);
    }
}