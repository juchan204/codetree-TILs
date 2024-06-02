import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr1 = new int[2][4];
        
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 4 ; j++){
                arr1[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < 2; i++){
            int sum = 0;
            int cnt = 0;
            for(int j = 0; j < 4 ; j++){
                sum += arr1[i][j];
                cnt++;
            }
            System.out.printf("%.1f ",(double)sum/cnt);
        }
        System.out.println();

        for(int j = 0; j < 4; j++){
            int sum = 0;
            int cnt = 0;
            for(int i = 0; i < 2 ; i++){
                sum += arr1[i][j];
                cnt++;
            }
            System.out.printf("%.1f ",(double)sum/cnt);
        }
        System.out.println();

        int sum = 0;
        int cnt = 0;
        for(int j = 0; j < 4; j++){
            for(int i = 0; i < 2 ; i++){
                sum += arr1[i][j];
                cnt++;
            }
        }
        System.out.printf("%.1f ",(double)sum/cnt);

    }
}