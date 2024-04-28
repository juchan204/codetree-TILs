import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i ;
        int sum = 1;

        for ( i = 1 ; i <= 10 ; i++){
            sum = sum * i;

            if ( sum >= n )
                break;
       }

       System.out.print(i);
    }   

}