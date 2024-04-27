import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sumVal = 0;
        int cnt = 0;
        double aver = 0;

             
        for ( int i = 1 ; i <= 10 ; i++){
            int a = sc.nextInt();
            if ( a <= 200 && a >= 0){
                sumVal += a;
                cnt ++;
            }
        }
        
        aver = (double) sumVal / cnt ;

        System.out.printf("%d %.1f" ,sumVal,aver);
        
    }
}