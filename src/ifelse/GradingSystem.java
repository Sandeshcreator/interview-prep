package ifelse;

import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your marks");
        double marks = scanner.nextDouble();
        if (marks > 90) {
            System.out.println("Excellent");
        } else if (marks > 80) {
            System.out.println("Good");
        } else if (marks > 70) {
            System.out.println("fair");
        } else if (marks > 60) {
            System.out.println("Meets expectations");
        } else {
            System.out.println("Below par");
        }


    }
}
