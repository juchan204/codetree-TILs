import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter(" ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        float result = (float) (a + b) / (a - b); 
        System.out.printf("%.2f", result);
    }
}