import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        System.out.println("Welcome to Temperature Converter program ");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Forenheight which you want to covert in Celcius : ");
        double forenHeight= input.nextDouble();
        double celcius = (forenHeight-32) * 5/9;
        System.out.println("Temperature in Celsius is: "+celcius);
    }
}
