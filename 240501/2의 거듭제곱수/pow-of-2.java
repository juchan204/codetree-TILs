import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int cnt = 0 ;

        while (true){
            if ( a / 2 > 1){
                a = a / 2 ;
                cnt ++;
            }
                
            
            else {
                cnt ++;
                break ;
            }
                
        }
        System.out.println(cnt);
    }
}