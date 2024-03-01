import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = input.nextInt();
        if(year%400 == 0 || (year%4 == 0 && year%100 != 0)){
            System.out.println("This is a leap year");
        }
        else{
            System.out.println("Not a leap year");
        }
    }
}
