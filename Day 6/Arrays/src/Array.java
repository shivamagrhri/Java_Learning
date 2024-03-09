public class Array {
    public static void main(String[] args) {
//        int[] myArr = new int[5];
//        myArr[0] = 92;
//        myArr[1] = 17;
//        myArr[2] = 64;
//        myArr[3] = 52;
//        myArr[4] = 63;
        int[] myArr = {92,17,64,52,63};
//        int index = 3;
//        System.out.println(myArr[0]);
//        System.out.println(myArr[1]);
//        System.out.println(myArr[2]);
//        System.out.println(myArr[index]);
//        System.out.println(myArr[4]);
        int index = 0;
//        while(index<5){
        while(index<myArr.length){
            System.out.println(myArr[index]);
            index++;
        }

        String[] strArr = new String[4];
        strArr[0] = "Shivam Agrahri";
        String[] myStr = {"first", "Second", "Third"};
        System.out.println(myStr.length);

    }
}