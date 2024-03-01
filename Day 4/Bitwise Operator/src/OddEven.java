import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = input.nextInt();
        if((num&1) == 1){
            System.out.println("Number is Odd");
        }else{
            System.out.println("Number is Even");
        }
    }
}
