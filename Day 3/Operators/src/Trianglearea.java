import java.util.Scanner;

public class Trianglearea {
    public static void main(String[] args) {
        System.out.println("Welcome to the area of triangle Challenge");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Base of Tiangle: ");
        double base = input.nextDouble();
        System.out.print("Enter the Height of Tiangle: ");
        double height = input.nextDouble();
        double area = 0.5 * base * height;
        System.out.println("Area of triangle is: "+area);
    }
}
