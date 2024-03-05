import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Patterns Challenge");
        System.out.print("Please enter the number of rows: ");
        int num = input.nextInt();
        firstPattern(num);
        secPattern(num);
        thirdPattern(num);
    }

    public static void thirdPattern(int num){
        System.out.println("Here is Left Half Pyramid");
        int row = num;
        while(row>0){
            int j = 0;
            while(j<row-1){
                System.out.print("  ");
                j++;
            }
            int i = 0;
            while(i <= (num-row)){
                System.out.print("* ");
                i++;
            }
            System.out.println();
            row--;
        }
    }

    public static void secPattern(int num){
        System.out.println("Here is Reverse Right half pyramid");
        int row = num;
        while(row>0){
            int i = 0;
            while(i<row){
                System.out.print(" *");
                i++;
            }
            System.out.println();
            row--;
        }
    }
    public static void firstPattern(int num){
        int rows = 0;
        while(rows<num){
            System.out.print("*");
            int i = 0;
            while(i<rows){
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows++;
        }
    }
}
