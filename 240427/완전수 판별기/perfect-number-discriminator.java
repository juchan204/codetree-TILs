import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int sumVal = 0 ;

        for ( int i = 1 ; i <= a ; i++){
            if ( a % i == 0 && a != i){
                sumVal += i;
            }
        }

        if (sumVal == a){
            System.out.println("P");
        }
        else {
            System.out.println("N");
        }
    }
}