import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < 10; i++) {
            if((i + 1) % 2 == 1)
                sum1 += arr[i];
            if((i + 1) % 2 == 0) {
                sum2 += arr[i];
            }
        }
        if (sum1 > sum2){
            System.out.print(sum1 - sum2);
        }
        else {
            System.out.print(sum2 - sum1);
        }

        
    }
}