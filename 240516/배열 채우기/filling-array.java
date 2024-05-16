import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언
        int[] arr = new int[10];

        for(int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] == 0){
                for(int j = i - 1 ; j >= 0; j--) {
                    System.out.print(arr[j]+" ");
                }
                break;
            }
        }
    }
}