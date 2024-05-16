import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = 0;
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            int[] arr = new int[4];
            int sum = 0;
            for(int j = 0; j < 4; j++){
                arr[j] = sc.nextInt();
                sum += arr[j];
            }   
            double avg = (double) sum / 4;
            if (avg >= 60){
                System.out.println("pass");
                cnt++;
            }
            else 
                System.out.println("fail");
        }
        //출력
        System.out.printf("%d", cnt);
    }
}