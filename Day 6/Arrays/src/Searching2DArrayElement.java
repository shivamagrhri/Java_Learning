import java.util.Scanner;

public class Searching2DArrayElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the searching challenge in 2D array");
        int[][] arr = ArrayUtility.input2Darray();
        System.out.print("Enter the number that you want to search: ");
        int number = input.nextInt();
        boolean isFound = search(arr, number);
        if(isFound){
            System.out.println("Your number was found in the array");
        }else{
            System.out.println("Your number was not found in the array");
        }

    }
    public static boolean search(int[][] arr, int number){
        int i = 0;
        while(i< arr.length){
            int j = 0;
            while(j<arr[i].length){
                if(number == arr[i][j]){
                    return true;
                }
                j++;
            }
            i++;
        }
        return false;
    }

}
