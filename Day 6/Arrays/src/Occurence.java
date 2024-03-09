import java.util.Scanner;

public class Occurence {
    public static void main(String[] args) {
        int[] numArr = ArrayUtility.inputArr();
        System.out.println("Welcome to the Occurences of Array");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number that you want to find in the array: ");
        int num = input.nextInt();
        int occurences = noOfOccurences(numArr, num);
        System.out.println("Your number was found " +occurences+ " times in the array");

    }
    public static int noOfOccurences(int[] numArr, int num){
        int occ = 0;
        int i = 0;
        while(i<numArr.length){
            if(numArr[i] == num){
                occ++;
            }
            i++;
        }
        return occ;
    }
}
