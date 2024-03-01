import java.util.Scanner;

public class Greatestofthree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter th first number: ");
        int firstNum = input.nextInt();
        System.out.print("Enter th second number: ");
        int secNum = input.nextInt();
        System.out.print("Enter th third number: ");
        int thirdNum = input.nextInt();
        if(firstNum >= secNum && firstNum >= thirdNum){
            System.out.println("Greatest of three numbers is "+firstNum);
        } else if (secNum >= thirdNum) {
            System.out.println("Greatest of three number is "+secNum);
        }else{
            System.out.println("Greatest of three number is "+thirdNum);
        }
    }
}
