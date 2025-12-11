package loop;

import java.util.Scanner;

public class FibSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int firstNumber = 0;
        int secondNumber = 1;

        for (int i = 0; i < input; i++) {
            if (input == 1) {
                System.out.println(firstNumber + " " + secondNumber + " ");
                break;
            }
            System.out.print(firstNumber + " ");
            int temp = firstNumber + secondNumber;
            secondNumber = firstNumber;
            firstNumber = temp;
        }
    }
}
