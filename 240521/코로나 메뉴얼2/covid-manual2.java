import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int countA = 0;
        int countB = 0;
        int countC = 0;
        int countD = 0;

        for (int i = 0; i < 3; i++) {
            String symptom = sc.next();
            int temperature = sc.nextInt();

            if (symptom.equals("Y") && temperature >= 37) {
                countA++;
            } else if (symptom.equals("N") && temperature >= 37) {
                countB++;
            } else if (symptom.equals("Y") && temperature < 37) {
                countC++;
            } else if (symptom.equals("N") && temperature < 37) {
                countD++;
            }
        }

        System.out.print(countA + " " + countB + " " + countC + " " + countD);
        if (countA >= 2) {
            System.out.print(" E");
        }
        System.out.println();
    }
}