import java.util.Scanner;

public class PrimeNumberSystem {



        public static void prime(int number) {

            int i, m, temp = 0;
            //m = number / 2;


            if (number == 0 || number == 1) {
                System.out.println("Not a prime number");
            } else {
                for (i = 2; i <= 100; i++) {
                    if (number % i == 0) {
                        System.out.println("not a prime number");
                        temp = 1;
                        break;

                    }
                }
            }
            if (temp == 0) {
                System.out.println("Prime number");
            }

        }
    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        System.out.println("Enter any valid number");
        int input = number.nextInt();
       // PrimeNumberSystem pn = new PrimeNumberSystem();
        prime(input);



    }

}