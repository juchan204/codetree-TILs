import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int cnt2 = 0, cnt3 = 0, cnt12 = 0 ;

        for( int i = 1 ; i <= a ; i++){
            if ( i % 2 == 0 )
                cnt2 ++;
            if ( i % 3 == 0 )
                cnt3 ++;
            if ( i % 12 == 0 )
                cnt12 ++;
            if ( i % 2 == 0 && i % 3 == 0)
                cnt2 --;
            if ( i % 2 == 0 && i % 12 == 0)
                cnt2 --;    
            if ( i % 3 == 0 && i % 12 == 0)
                cnt3 --;
            if ( i % 2 == 0 && i % 3 == 0 && i % 12 == 0) {
                cnt2 --;
                cnt3 --;
            }          
        }
        System.out.print(cnt2 + " " + cnt3 + " " + cnt12);
    }
}