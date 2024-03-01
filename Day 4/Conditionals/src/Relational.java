import java.util.Scanner;

public class Relational {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Driving Liscense Portal");
        System.out.print("Please enter your age: ");
        int age = input.nextInt();
        if(age >= 18){
            System.out.println("You are Eligible for driving liscense");
        }else{
            System.out.println("You are not Eligible for driving liscense");
        }
    }
}
