import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        System.out.println("Welcome to the grades calculator");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your percentage: ");
        float perc = input.nextFloat();
        if(perc > 90){
            System.out.println("Your Grade is A");
        } else if (perc>75 && perc<=90) {
            System.out.println("Your grade is B");
        } else if (perc>60 && perc<=75) {
            System.out.println("Your grade is C");
        }else if (perc>30 && perc<=60){
            System.out.println("Your grade is D");
        }else{
            System.out.println("Your grade is F");
        }
    }
}
