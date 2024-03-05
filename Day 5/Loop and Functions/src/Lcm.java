import java.util.Scanner;

public class Lcm {
    public static void main(String[] args) {
        System.out.println("Welcome to the LCM Challenge");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your first number: ");
        int first = input.nextInt();
        System.out.print("Please enter your second number: ");
        int second = input.nextInt();
        int lcm = lcmOfTwo(first, second);
        System.out.println("The LCM of the above numbers is: "+lcm);

    }
    public static int lcmOfTwo(int first, int second){
        int i = 1;
        while(true){
            int factor = first * i;
            if(factor%second==0){
                return factor;
            }
            i++;
        }
    }
}
