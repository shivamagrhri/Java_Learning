import java.util.Scanner;

public class gCD {
    public static void main(String[] args) {
        System.out.println("Welcome to the Greatest Common Divisor Challenge");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your first number: ");
        int first = input.nextInt();
        System.out.print("Please enter your second number: ");
        int second = input.nextInt();
        int gcd = greatestCommonDivisor(first, second);
        System.out.println("The Greatest Common Integer of the above numbers is: "+gcd);
    }
    public static int greatestCommonDivisor(int num1, int num2){
        int gcd = 1;
        int i = 2;
        int least = least(num1, num2);
        while(i<=least){
            if(num1%i==0 && num2%i==0){
                gcd = i;
            }
            i++;
        }
        return gcd;
    }

    public static int least(int num1, int num2){
        if(num1<num2){
            return num1;
        }else{
            return num2;
        }
    }
}
