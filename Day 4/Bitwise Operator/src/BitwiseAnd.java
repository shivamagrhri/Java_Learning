import java.util.Scanner;

public class BitwiseAnd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the First Number: ");
        int firstNum = input.nextInt();
        System.out.print("Enter the second number: ");
        int secNum = input.nextInt();
        int result = firstNum & secNum;
        System.out.println("The result is: "+result);
    }
}