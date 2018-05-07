import java.util.Scanner;

public class TemaNr8 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double mps;
        double kph;
        double secunde;

        System.out.print("Introdu distanta in metri: ");
        double D = input.nextDouble();

        System.out.print("Input ore: ");
        double O = input.nextDouble();

        secunde = O*3600;
        mps = D / O;
        kph = ( D/1000.0 ) / ( secunde/3600.0);

        System.out.println("Viteza in metri/secunda este : " + mps);
        System.out.println("Viteza in kp/h este : " + kph);
    }
}
