import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Fibonacci Series challenge");
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        fibonacci(num);
    }
    public static int fibonacci(int num){
        int first = 0;
        int second = 1;
        int i = 1;
        while(i<=num){
            int next = first + second;
            System.out.print(next+" ");
            first = second;
            second = next;
            i++;
        }
        return 0;
    }
}
