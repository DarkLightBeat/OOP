import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner number = new Scanner(System.in);
        
        System.out.print("Enter temperature in Celsius: ");
        float Celsius = number.nextFloat();
       
        float Fahrenheit = Celsius * 9 / 5 + 32;

        System.out.println("Temperature in Fahrenheit: " + String.format("%.2f", Fahrenheit));
        
        number.close();
    }
}
