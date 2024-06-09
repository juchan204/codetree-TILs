import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char a = sc.next().charAt(0);
        int cnt = 0;
        
        String[] arr = new String[]{ "apple", "banana" , "grape" , "blueberry" , "orange" };

        for ( int i = 0 ; i < 5 ; i++){
            for(int j = 2; j <= 3; j++)
                if(arr[i].charAt(j) == a){
                    System.out.println(arr[i]);
                    cnt++;
                }          
        }
        System.out.print(cnt);
    }
}