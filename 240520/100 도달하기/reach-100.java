import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 배열 선언
        int[] arr = new int[100];
        arr[0] = 1 ;
        arr[1] = sc.nextInt();
        int cnt = 0;

        for(int i = 2; i < 100; i++) {
            arr[i] = arr[i - 2] + arr[i - 1];
            cnt++;
            if ( arr[i] >= 100 ){
                cnt++;
                break;
            }
            
        }

        for(int i = 0; i <= cnt; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}