import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 배열 선언
        int[] arr = new int[100];
        int cnt = 0;
        
        // 입력받은 정수의 배수를 배열에 저장
        for(int i = 0; i < 100 ; i++){
            arr[i] = sc.nextInt();
            cnt++;
            if ( arr[i] == 0){
                break;
            }
        }
            
        
        // 배열의 원소들을 출력하다가 5의 배수가 2번 나오면 출력을 멈춤
        for(int i = 0; i < cnt -1; i++) {
            
            if (arr[i] % 2 == 1 ){
                System.out.print(arr[i]+3 + " ");
            }
            if (arr[i] % 2 == 0 ){
                System.out.print(arr[i] / 2 + " ");
            }
            
        }
    }
}