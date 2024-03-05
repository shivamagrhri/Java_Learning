import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();
        multiplication(number);
        /*Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        int i = 1;
        while(i<=10){
            System.out.println(num*i);
            i += 1;
        }*/

    }

    public static void multiplication(int number){
     int i = 1;
     while(i<=10){
         System.out.println(number+ " X " +i+ " = " + (number*i));
         i += 1;
     }
    }
}
