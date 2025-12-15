package loop;

public class Reverse {
    public static void main(String[] args) {
        int input = 1234567;
        int res = input;

        while (res > 0) {
            System.out.println(res % 10);
            res /= 10;
        }


    }
}
