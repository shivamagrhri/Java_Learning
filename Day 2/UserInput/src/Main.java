import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter your Name :");
        String name = input.nextLine();
        System.out.println("Good Morning "+ name);
        System.out.print(name +", Your Age is =");
        int age = input.nextInt();
        System.out.println("My Age is "+ age);
    }
}