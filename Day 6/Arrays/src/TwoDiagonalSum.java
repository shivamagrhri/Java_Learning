public class TwoDiagonalSum {
    public static void main(String[] args) {
        System.out.println("Welcome to the Diagonal sum challenge in Array");
        int[][] arr = ArrayUtility.input2Darray();
        long sum = sumOfDiagonals(arr);
        System.out.println("Sum of diagonals of the array is: "+sum);

    }
    public static long sumOfDiagonals(int[][] arr){
        long leftsum = sumOfLeftDiagonal(arr);
        long rightsum = sumOfRightDiagonal(arr);
        long sum = leftsum + rightsum;
        if(arr.length % 2 != 0){
            int ind = arr.length / 2;
            sum -= arr[ind][ind];
        }
        return sum;
    }
    public static long sumOfLeftDiagonal(int[][] arr){
        long sum = 0;
        int i = 0 ;
        while(i< arr.length){
            sum += arr[i][i];
            i++;
        }
        return sum;
    }
    public static long sumOfRightDiagonal(int[][] arr){
        long sum = 0;
        int i = 0;
        while(i<arr.length){
            int col = arr.length - 1 - i;
            sum += arr[i][col];
            i++;
        }
        return sum;
    }
}
