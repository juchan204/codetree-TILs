import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        int sum = 0;
        int sum_3 = 0;
        int cnt = 0;

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 1; i < 10; i += 2) {
            sum += arr[i];
        }

        for (int i = 2; i < 10; i += 3) {
            sum_3 += arr[i];
            cnt++;
        }

        System.out.print(sum + " ");
        System.out.printf("%.1f",(double)sum_3/cnt);
    }
}