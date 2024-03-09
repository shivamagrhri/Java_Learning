import java.util.Scanner;

public class DeleteElementArr {
    public static void main(String[] args) {
        System.out.println("Welcome to the deleting element array challenge");
        Scanner input = new Scanner(System.in);
        int[] numArr = ArrayUtility.inputArr();
        System.out.print("Enter the number you want to delete: ");
        int numDelete = input.nextInt();
        int[] newArr = deleteNumber(numArr, numDelete);
        System.out.println("Here is your new Array");
        ArrayUtility.displayArray(newArr);
    }
    public static int[] deleteNumber(int[] numArr, int numDelete){
        int occ = Occurence.noOfOccurences(numArr, numDelete);
        if(occ == 0){
            return numArr;
        }
        int newSize = numArr.length - occ;
        int[] newArr = new int[newSize];
        int i =0, j = 0;
        while(i<numArr.length){
            if(numArr[i] != numDelete){
                newArr[j] = numArr[i];
                j++;
            }
            i++;
        }
        return newArr;
    }
}
