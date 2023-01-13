import java.util.Scanner;

public class OpClass {

    public void test(){
        System.out.println("too cold");
    }
    public int add(int x,int y){
        int sub =x - y;
        return sub;
    }
    public int div(int x,int y){
        int sum =x + y;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("enter the value");
        Scanner input = new Scanner(System.in);

        int s = input.nextInt();
        int z = input.nextInt();

        OpClass oop = new OpClass();
        oop.test();
        int k = oop.add(s,z);
        int a = oop.div(s,z);
        System.out.println(k);
        System.out.println(a);
    }
}
