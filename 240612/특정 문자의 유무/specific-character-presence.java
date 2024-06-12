import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        int length = s.length();

        boolean exists = false;
        boolean exists1 = false;

        for (int i = 0; i < length - 1; i++) {
            if (s.substring(i, i + 2).equals("ee")) {
                exists = true;
            }
            else if (s.substring(i, i + 2).equals("ab")) {
                exists1 = true;
            }
        }

        if (exists == true) {
            System.out.print("Yes" + " ");
        }
        else {
            System.out.print("No" + " ");
        }

        if (exists1 == true) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}