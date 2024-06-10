import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr = new String[10];
        for(int i = 0; i < 10; i++) {
            arr[i] = sc.next();
        }
        char a = sc.next().charAt(0);

        boolean found = false;

        for(int i = 0; i < 10; i++) {
            for (int j = arr[i].length() - 1 ; j >= 0; j--){
                if (arr[i].charAt(arr[i].length() - 1) == a) {
                    System.out.println(arr[i]);
                    found = true;
                    break;
                }
            }
                
        }
        if (!found) {
            System.out.println("None");
        }

    }
}