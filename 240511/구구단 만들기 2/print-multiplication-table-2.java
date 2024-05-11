import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int cnt = 2;

        for (int i = 1; i <= 4; i++) {
            for (int j = b; j >= a; j--) {
                System.out.print(j + " * " + cnt + " = " + (cnt * j) + " ");
                if ( j != a){
                    System.out.print("/ ");
                }
            }
            cnt += 2;
            System.out.println();
        }
    }
}