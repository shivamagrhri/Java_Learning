import java.util.Scanner;

public class arithmeticchallenge {
    public static void main(String[] args) {
        System.out.println("Welcome to the Challenge of Arithmetic Operators");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int firstNum = input.nextInt();
        System.out.print("Enter the second number: ");
        int secNum = input.nextInt();
        int sum = firstNum + secNum;
        int subs = firstNum - secNum;
        int mul = firstNum * secNum;
        int div = firstNum / secNum;
        int mod = firstNum % secNum;
        System.out.println("Sum = "+sum);
        System.out.println("Substraction = "+subs);
        System.out.println("Multiplication = "+mul);
        System.out.println("Division = "+div);
        System.out.println("Modulus = "+mod);

    }
}
