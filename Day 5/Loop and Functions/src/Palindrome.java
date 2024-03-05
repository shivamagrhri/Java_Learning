import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Palindrom challenge");
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        boolean isPalindrome = isPalindrome(num);
        if(isPalindrome){
            System.out.println("Your number is a Palindrome number");
        }else{
            System.out.println("Your number is not a palindrome number");
        }
    }
    public static boolean isPalindrome(int num){
        int reverse = reverse(num);
        return num == reverse;
    }
    public static int reverse(int num){
        int newNum = 0;
        while(num>0){
            int digit = num%10;
            newNum = newNum * 10 + digit;
            num /= 10;
        }
        return newNum;
    }
}
