import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArr() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of element in the array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        int i = 0;
        while(i<size){
            System.out.print("Please enter element no " + (i+1) + ": ");
            arr[i] = input.nextInt();
            i++;
        }
        return arr;
    }
    public static  void displayArray(int[] numArr){
        int i = 0;
        while(i< numArr.length){
            System.out.print(numArr[i] + " ");
            i++;
        }
        System.out.println();
    }

    public static int[][] input2Darray(){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the number of rows: ");
        int rows = input.nextInt();
        System.out.print("Please Enter the number of columns: ");
        int cols = input.nextInt();
        int[][] numArr = new int[rows][cols];
        int i = 0;
        while (i<rows){
            int j = 0;
            while(j<cols){
                System.out.print("Please enter element row: "+(i+1)+ ", Columns: "+(j+1)+ " :");
                numArr[i][j] = input.nextInt();
                j++;
            }
            i++;
        }
        return numArr;
    }
}
