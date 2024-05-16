import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int i; // i를 for문 밖에서도 사용하기 위해 선언 위치를 변경합니다.

        for(i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] == 0){
                for(int j = i - 1 ; j >= 0; j--) {
                    System.out.print(arr[j]+" ");
                }
                break;
            }
        }
        // 0이 입력되지 않고 모든 숫자가 입력된 경우
        if (i == 10){ // i 변수의 범위를 정확히 체크합니다.
            for(i = 9 ; i >= 0; i--) {
                System.out.print(arr[i]+" ");
            }
        }
            
    }
}