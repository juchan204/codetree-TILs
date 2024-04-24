import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        // a가 짝수일 때
        if (a % 2 == 0) {
            int b = a / 2;

            if ( b % 2 == 0 ) {
                    System.out.println(b);
                }   
                
            if ( b % 2 == 1 ) {
                    System.out.println((b + 1) / 2);
                }
        }
        // a가 홀수일 때
        if (a % 2 == 1) {
            int b = (a + 1) / 2;
            System.out.println(b);
        }

        
    }
}