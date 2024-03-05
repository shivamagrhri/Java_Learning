import java.util.Scanner;

public class OddSum {
    public static void main(String[] args) {
        System.out.println("Welcome to the sum of given Odd number");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = input.nextInt();
        System.out.println(sumOdd(n));
    }
    public static int sumOdd(int n){
        int i = 1;
        int sum = 0;
        while(i<=n){
            sum = sum + i;
            i += 2;
        }
        return sum;
//        int i = 1;
//        int sum = 0;
//        while(i<=n){
//
//            if(i%2!=0){
//                sum = sum + i;
//            }
//            i+=1;
//        }
//        System.out.println(sum);
    }
}
