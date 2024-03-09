public class SumAverage {
    public static void main(String[] args) {
        System.out.println("Welcome to the Sum & Average Challenge of Array");
        int[] numArr = ArrayUtility.inputArr();
        long sum = sum(numArr);
        double avg = avg(numArr);
        System.out.println("Sum of Array is: "+sum);
        System.out.print("Average of Array is: "+avg);

        }
        public static long sum(int[] numArr){
        int i = 0;
        long sum = 0;
        while(i<numArr.length){
            sum += numArr[i];
            i++;
        }
        return sum;
    }
    public static double avg(int[] numArr){
        long sum = sum(numArr);
        return (double) (sum/numArr.length);
    }
}
