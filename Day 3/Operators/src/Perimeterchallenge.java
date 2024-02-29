import java.util.Scanner;

public class Perimeterchallenge {
    public static void main(String[] args) {
        System.out.println("Welcome to the perimeter challenge");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the sides of rectangle: ");
        System.out.print("Enter the side A: ");
        int sideA = input.nextInt();
        System.out.print("Enter the side B: ");
        int sideB = input.nextInt();
        System.out.print("Enter the side C: ");
        int sideC = input.nextInt();
        System.out.print("Enter the side D: ");
        int sideD = input.nextInt();
        System.out.println("Perimeter of rectangle ABCD is: "+ (sideA+sideB+sideC+sideD));
    }
}
