import java.util.Scanner;

public class AgeCategory {
    public static void main(String[] args) {
        System.out.println("Welcome to Age calculator");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the age: ");
        int age = input.nextInt();
        if(age<=13){
            System.out.println("You are a Child");
        }else if(age<=20 && age>13){
            System.out.println("You are a Teen");
        }else if(age<=60 && age>20){
            System.out.println("You are an Adult");
        }else{
            System.out.println("You are a Senior citizen");
        }
    }
}
