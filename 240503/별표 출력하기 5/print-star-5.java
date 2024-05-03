import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        for ( int i = 0; i < a; i++){
            for ( int j = 1; j <= a - i ; j++){
                
                for ( int k = 1 ; k <= a - i ; k++){
                    System.out.print("*");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}