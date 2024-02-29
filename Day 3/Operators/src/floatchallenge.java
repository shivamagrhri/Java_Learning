import java.util.Scanner;

public class floatchallenge {
    public static void main(String[] args) {
        System.out.println("Welcome to Floating number Challenge ");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        float firstNum = input.nextFloat();
        System.out.print("Enter the Second number: ");
        float secondNum = input.nextFloat();
        float prod = firstNum*secondNum;
        System.out.println("The Product of two floating Number is: "+prod);
    }
}
