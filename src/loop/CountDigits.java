package loop;

public class CountDigits {
    public static void main(String[] args) {
        int numb = 4589;
        int storedigit = numb;
        int count = 0;

        if (numb == 0) {
            System.out.println(1);
            return;
        }

        while (storedigit > 0) {
            count++;
            storedigit /= 10;
        }

        System.out.println(count);
    }
}
