package loop;

public class DigitsNumber {
    public static void main(String[] args) {
        int number = 455689;
        int n = Math.abs(number);
        int result = 0;

        if (n == 0) {
            System.out.println(0);
            return;
        }

        while (n > 0) {
            int digit = n % 10;
            result = result * 10 + digit;
            n /= 10;
        }

        while (result > 0) {
            System.out.println(result % 10);
            result /= 10;
        }
    }
}
