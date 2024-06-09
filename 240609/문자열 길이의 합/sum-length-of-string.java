import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        int lenAll = 0;

        String[] arr = new String[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        for(int i = 0; i < n; i++) {
            int len = arr[i].length();
            lenAll += len;
        }
        for(int i = 0; i < n; i++)
            if(arr[i].charAt(0) == 'a') {
                cnt++;
            }
        System.out.println(lenAll + " " + cnt);
    }
}