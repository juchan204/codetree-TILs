import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int[] countArr = new int[10];
        int cnt = 0 ;

        for (int i = 0; i < 100; i++) {
            arr[i] = sc.nextInt();
            cnt++;
            if ( arr[i] == 0 ) {
                break;
            }
        }

        // 개수 세기
        for (int i = 0; i < cnt; i++) {
            arr[i] = arr[i] / 10;
            countArr[arr[i]]++;
        }

        // 개수 출력
        for (int i = 1; i < 10; i++) {
            System.out.println(i + " - " + countArr[i]);
        }
    }
}