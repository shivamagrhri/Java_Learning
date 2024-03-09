public class PalindromeArray {
    public static void main(String[] args) {
        System.out.println("Welcome to the Array Palindrome");
        int[] numArr = ArrayUtility.inputArr();
        boolean isPalin = isPalin(numArr);
        if(isPalin){
            System.out.println("Your Array is a Palindrome");
        }else{
            System.out.println("Your Array is not a Palindrome");
        }

    }
    public static boolean isPalin(int[] numArr){
        int i = 0;
        while(i< numArr.length/2){
            if(numArr[i] != numArr[numArr.length - 1 - i]){
                return false;
            }
            i++;
        }
        return true;
    }

}
