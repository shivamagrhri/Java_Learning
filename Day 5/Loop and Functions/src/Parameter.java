public class Parameter {
    public static void main(String[] args) {
        System.out.println("Sum of two numbers is: "+sum(4,7));
    }
    public static int sum(int a, int b){
        System.out.println("First number received: "+a);
        System.out.println("Second number received: "+b);
        int add = a+b;
        return add;
    }
}
