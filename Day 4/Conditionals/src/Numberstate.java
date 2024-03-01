import java.util.Scanner;

public class Numberstate {
    public static void main(String[] args) {
        System.out.println("Welcome to number system challenge");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        float num = input.nextFloat();
        if(num>0){
            System.out.println("Number is positive");
        }else if(num<0){
            System.out.println("Number is negative");
        }else{
            System.out.println("Number is zero");
        }
    }
}
