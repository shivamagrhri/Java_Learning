public class MaxMinArr {
    public static void main(String[] args) {
        System.out.println("Welcome to Max & Min Challenge in the Array");
        int[] newArr = ArrayUtility.inputArr();
        int max = max(newArr);
        int min = min(newArr);
        System.out.println("Maximum number in the Array is: "+max);
        System.out.print("Minimum number in the Array is: "+min);
    }

    public static int min(int[] newArr){
        int min = Integer.MAX_VALUE;
        int i = 0;
        while(i< newArr.length){
            if(min>newArr[i]){
                min = newArr[i];
            }
            i++;
        }
        return min;
    }
    public static int max(int[] newArr){
        if(newArr.length == 0){
            return Integer.MIN_VALUE;
        }
        int max = newArr[0];
        int i = 0;
        while(i< newArr.length){
            if(max < newArr[i]){
                max = newArr[i];
            }
            i++;
        }
        return max;
    }

}
