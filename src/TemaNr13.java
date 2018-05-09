import java.util.Scanner;

public class TemaNr13 {
    public static void main(String[] args) {

        double input;
        double suma = 0;

        Scanner tastatura = new Scanner(System.in);
        System.out.print("Apasa tasta '1' pentru a continua sau tasta '0' pentru a inchide programul: ");
        input = tastatura.nextDouble();

        while ( input != 0) {
            System.out.print("Introdu un numar natural: ");
            input = tastatura.nextDouble();

            if ( input > 4 && input < 11) {
                suma+=input;
            }
        }
        System.out.println("Suma este: " + suma);
    }
}
