import java.util.Scanner;

public class TemaNr4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Introdu o temperatura in Fahrenheit: ");
        double F = input.nextDouble();

        double C =(( 5 *(F- 32.0)) / 9.0);
        System.out.println(F + " grade Fahrenheit este egal cu " + C + " grade Celsius");
    }
}