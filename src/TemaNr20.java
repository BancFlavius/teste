import java.util.Arrays;

public class TemaNr20 {
    public static void main(String[] args) {

        int sir[] = {1,3,4,5,6,7,8,9,10};
        int jumatate = (sir.length+1) / 2;
        int dublate;
        int triplate;

        for(int i = 0; i < jumatate; i++) {
            dublate = sir[i] * 2;
            sir[i] = dublate;;
            //System.out.println("Prima jumatate a sirului cu numere dublate: " + dublate);
        }

        for(int j = jumatate+1; j > jumatate && j < sir.length; j++) {
            if ( (sir[j] / 2 ) != 0 ) {
                triplate = sir[j] * 3;
                sir[j] = triplate;
                //System.out.println("A doua jumatate a sirului cu numere triplate: " + triplate);
            } // else System.out.println("A doua jumatate a sirului cu numere pare: " + sir[j]);
        }
        System.out.println(Arrays.toString(sir));
        }
    }

