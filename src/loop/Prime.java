package loop;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number you want input.");
        int time = scanner.nextInt();

        for (int i = 1; i <= time; i++) {
            System.out.println("Enter a number to check.");
            int userInput = scanner.nextInt();
            int count = 0;
            for (int j = 2; j * j <= userInput; j++) {
                if (userInput % j == 0) {
                    count++;
                }
            }

            System.out.println(count == 0 ? "Prime" : "not prime");

        }
    }
}
