import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = n;

        for ( int i = 1 ; i <= n ; i++){
            for ( int j = 1 ; j <= cnt ; j++){
                if ( j != cnt )
                    System.out.print(i + " * " + j + " = " + (i * j) + " / ");
                else {
                    System.out.println(i + " * " + j + " = " + (i * j));
                }
                    
            }
            cnt --;
        }
    }
}