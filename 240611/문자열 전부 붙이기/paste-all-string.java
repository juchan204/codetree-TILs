import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] a = new String[n];
        String totStr = "";
        
        for (int i = 0; i < n; i++) {
            a[i] = sc.next();
        }

        for(int i = 0; i < n; i++) {
            totStr += a[i];
        }

        System.out.println(totStr);
    }
}