import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int cnt = 0 ;

        while (a < 1000){

            if ( a % 2 == 0){
                a = a * 3 + 1;
                cnt ++;
            }
            else {
               a = a * 2 + 2 ;
               cnt ++; 
            }
                
        }

        System.out.print(cnt);
    }
}