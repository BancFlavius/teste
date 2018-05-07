import java.util.Scanner;

public class TemaNr7 {
    public static void main(String[] args) {
        System.out.print("Introdu costul total al produsului: ");

        double costTotal;

        Scanner cost = new Scanner(System.in);
        costTotal = cost.nextDouble();

        double exTva = (costTotal * 0.81);
        double tva = costTotal - exTva;

        System.out.println("TVA-ul este: " + tva + "RON");
        System.out.println("Costul produsului inainte de TVA: " + exTva + "RON");

    }
}
