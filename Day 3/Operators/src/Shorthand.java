import java.util.Scanner;

public class Shorthand {
    public static void main(String[] args) {
        int a = 6;
        Scanner input = new Scanner(System.in);
        int x1 = input.nextInt();
        a += x1;
        System.out.println(a);
        int x2 = input.nextInt();
        a += x2;
        System.out.println(a);
        int x3 = input.nextInt();
        a += x3;
        System.out.println(a);
        int x4 = input.nextInt();
        a += x4;
        System.out.println(a);
    }
}
