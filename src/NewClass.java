import java.util.Scanner;

public class NewClass {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("enter a number");
        int num = reader.nextInt();

        if (num % 2 ==0)
            System.out.println("Even Number");
        else
            System.out.println("Odd Number");
    }
}
