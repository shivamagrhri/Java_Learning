import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the prime number challenge");
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        boolean isPrime = prime(num);
        if(isPrime){
            System.out.println("It's a prime number");
        }else{
            System.out.println("It's not a prime number");
        }
    }
    public static boolean prime(int num){
        int i = 2;
        while(i<num){
            if(num%i==0){
                return false;
            }
        i++;
        }
        return true;
    }
}
