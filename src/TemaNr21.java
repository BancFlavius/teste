import java.util.Arrays;
import java.util.Scanner;

public class TemaNr21 {
    public static void main(String[] args) {

        int sir[] = new int[15];
        int sir2[] = new int[sir.length];
        int counter = 0;
        int min;
        int max;
        Scanner input = new Scanner(System.in);

        System.out.print("Introduceti valoarea minima: ");
        min = input.nextInt();
        System.out.print("Introduceti valoarea maxima: ");
        max = input.nextInt();

        for(int i = 0; i < sir.length; i++) {
            int x =(int)(Math.random() * 100 + 1);
            sir[i] = x;
            if ( (sir[i] >= min) && (sir[i] <= max) ) {
                sir2[counter] = sir[i];
                counter++;
            }
        }
        int[] sirNou = Arrays.copyOfRange(sir2, 0, counter);

        System.out.println("Sirul cu valorile cuprinse intre " + min + " si " + max + " din sirul generat este: " + Arrays.toString(sirNou));
    }
}
