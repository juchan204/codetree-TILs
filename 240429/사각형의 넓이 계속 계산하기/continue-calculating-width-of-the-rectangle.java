import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a , b ;
        char c ;

        while (true){
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.next().charAt(0);

            if ( c == 'C'){
                System.out.println( a * b );
                break;
            }

            System.out.println( a * b );
        }
    }
}