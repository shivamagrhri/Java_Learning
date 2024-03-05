import java.util.Scanner;

public class ReverseDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Reverse Digits challenge");
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        int reverse = reverse(num);
        System.out.println("The Reverse of Given number is: "+reverse);
    }

    public static int reverse(int num){
        int newNum = 0;
        while(num>0){
            int digit = num %10;
            newNum = newNum*10 + digit;
            num = num /10;
        }
        return newNum;
    }
}
