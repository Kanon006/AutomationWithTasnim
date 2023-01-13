

public class PrimeNumber {
    public static void prime(int num) {

        int i, m, temp = 0;
        m = num / 2;
        if (num == 0 || num == 1) {
            System.out.println("not a prime number");

        }
        else {
            for (i = 2; i <= m; i++) {
                if (num % i == 0) {
                    System.out.println("not a prime number");
                    temp = 1;
                    break;
                }
            }
        }
        if (temp == 0) {
            System.out.println("is a prime number");

        }
    }

    public static void main(String[] args) {
        prime(1);
        prime(7);
        prime(10);
    }
}