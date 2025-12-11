package loop;

import java.util.Scanner;

public class PrintAllPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userLowerInput = sc.nextInt();
        int userHigherInput = sc.nextInt();

        for (int i = userLowerInput; i <= userHigherInput; i++) {
            int count = 0;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }

            if (count == 0) {
                System.out.println("Prime : " + i);
            }

        }
    }
}
