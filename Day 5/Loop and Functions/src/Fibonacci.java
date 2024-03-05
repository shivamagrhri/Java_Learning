import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Fibonacci Series challenge");
        System.out.print("Enter the number up to which you want to print the fabonacci series: ");
        int num = input.nextInt();
        printFibonacci(num);
    }
    public static void printFibonacci(int num){
        if(num < 0) return;
        System.out.print("0 ");
        if(num == 0) return;
        System.out.print("1 ");
        int first = 0, second = 1;
        while(first + second <= num){
            int third = first + second;
            System.out.print(third+ " ");
            first = second;
            second = third;
        }
    }
}
