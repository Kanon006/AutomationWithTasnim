import javax.lang.model.element.Name;
import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner integer = new Scanner(System.in);
        System.out.println("enter any integer number");
        int name = integer.nextInt();

        switch (name){

            case 1:
                System.out.println("Case1");
                break;
            case 2:
                System.out.println("Case2");
                break;
            case 3:
                System.out.println("Case3");
                break;
            case 4:
                System.out.println("Case4");
                break;
            case 5:
                System.out.println("Case5");
                break;
            default:
                System.out.println("wrong number");



        }
    }

}
