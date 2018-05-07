public class TemaNr5 {
    public static void main(String[] args) {

        int F = 40;

        // Calcul facut cu for loop
        /*for(int F=40; F<=100; F++ ) {

            double C =((5 * (F - 32)) / 9d);
            System.out.println(F + " grade Fahrenheit = " + C + " grade Celsius");
        }
        */

        // Calcul facut cu while
        /*while(F<=100) {
            double C=5/9D*(F-32);
            System.out.println(F + " grade Fahrenheit = " + C + " grade Celsius");
            F++;
        }
        */

        // Calcul facut cu do while
        do {
            double C=5/9D*(F-32);
            System.out.println(F + " grade Fahrenheit = " + C + " grade Celsius");
            F++;
        } while(F<=100);
    }
}
