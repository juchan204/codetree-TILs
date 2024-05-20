import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 배열 선언
        int[] arr = new int[100];
        arr[0] = 1 ;
        arr[1] = sc.nextInt();
        int cnt = 0;

        // 입력받은 정수로부터 출력할 값을 새로운 배열에 저장하고, 0이 나오면 for문을 탈출
        for(int i = 2; i < 100; i++) {
            arr[i] = arr[i - 2] + arr[i - 1];
            cnt++;
            if ( arr[i] >= 100 ){
                cnt++;
                break;
            }
            
        }

        // 0이 나오기 전까지의 배열의 인덱스에 저장된 값을 출력
        for(int i = 0; i <= cnt; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}