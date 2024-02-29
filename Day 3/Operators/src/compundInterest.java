import java.util.Scanner;

public class compundInterest {
    public static void main(String[] args) {
        System.out.println("Welcome to the Compound Interest Challenge");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the principle amount in Rs: ");
        int principle = input.nextInt();
        System.out.println("Now, Enter the rate of interest on the money you borrowed: ");
        float rate = input.nextFloat();
        System.out.println("Tell me for how many years you want to take money: ");
        float years = input.nextFloat();
        double comInt = principle * Math.pow((1 + rate / 100), years);
        System.out.println("Compund interest is: "+comInt);

    }
}
