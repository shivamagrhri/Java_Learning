import java.util.Scanner;

public class SumofN {
    public static void main(String[] args) {
        System.out.println("Welcome to the sum challenge");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int num = input.nextInt();
        int res = sumDigit(num);
        System.out.println("The sum of the digits is: "+res);
    }
    public static int sumDigit(int num){
        int sum = 0;
        int i = 1;
        while(i<=num){
            sum += i;
            i++;
        }
        return sum;
    }
}
