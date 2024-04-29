import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int sumVal = 0;
        int cnt = 0;

        while(true){
            a = sc.nextInt();

            if ( a >= 20 && a <= 29){ 
                sumVal += a;
                cnt ++;
                continue;
            }
                

            else {
                System.out.printf("%.2f",(double)sumVal / cnt);
                break;
            }
                
        }
    }
}