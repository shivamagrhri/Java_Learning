public class SumAvg2DArray {
    public static void main(String[] args) {
        System.out.println("Welcome to the Sum & Average of 2D Array");
        int[][] arr = ArrayUtility.input2Darray();
        long sum = sum(arr);
        double avg = avg(arr);
        System.out.println("Your sum of Array is: "+sum);
        System.out.println("Your average pf Array is: "+avg);
    }
    public static long sum(int[][] arr){
        long sum = 0;
        int i = 0;
        while(i< arr.length){
            int j = 0;
            while(j<arr[i].length){
                sum += arr[i][j];
                j++;
            }
            i++;
        }
        return sum;
    }
    public static double avg(int[][] arr){
        if(arr.length == 0){
            return 0;
        }
        int rows = arr.length;
        int cols = arr[0].length;
        double size = rows * cols;
        return sum(arr) / size;
    }
}
