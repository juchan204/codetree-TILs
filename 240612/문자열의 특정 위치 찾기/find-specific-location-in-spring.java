import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        char a = sc.next().charAt(0);

        if (s.indexOf(a) == -1){
            System.out.println("No");
        }
        else
            System.out.println(s.indexOf(a));
    }
}