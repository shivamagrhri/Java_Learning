import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        System.out.println("Welcome to the simple interest challenge");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your principle amount Rs: ");
        int principle = input.nextInt();
        System.out.print("Now, enter the rate of interest: ");
        float rate = input.nextFloat();
        System.out.print("Tell me for how many years you are borrowing the money: ");
        float time = input.nextFloat();
        double simpleInterest = (principle * rate * time) / 100;
        System.out.println("Simple Interest for the money is: "+simpleInterest);
    }
}
