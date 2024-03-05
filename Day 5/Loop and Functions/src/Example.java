public class Example {
    public static void main(String[] args) {
        firstPattern();
    }
    public static void firstPattern(){
        int row = 0;
        while(row<5){
            System.out.print("*");
            int i = 0;
            while(i<row){
                System.out.print(" *");
                i++;
            }
            System.out.println();
            row++;
        }
    }
}

