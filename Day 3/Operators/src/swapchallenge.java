import java.util.Scanner;

public class swapchallenge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of A: ");
        int a = input.nextInt();
        System.out.print("Enter the value of B: ");
        int b = input.nextInt();
        int c = a;
        a = b;
        b = c;
        System.out.println("Swapping Done....");
        System.out.println("Swapped value of A: "+a);
        System.out.println("Swapped value of B: "+b);
    }
}
