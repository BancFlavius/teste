import java.util.Arrays;

public class TemaNr21 {
    public static void main(String[] args) {

        int sir[] = {55, 23,11, 14,21, 22, 24, 0, -6, 11, 56, 67, 11 , 4,};
        int sir2[] = new int[sir.length];
        int counter = 0;
        int min = 21;
        int max = 56;

        for(int i = 0; i < sir.length; i++) {
            if ( (sir[i] >= min) && (sir[i] <= max) ) {
                sir2[counter] = sir[i];
                counter++;
            }
        }
        int[] sirNou = Arrays.copyOfRange(sir2, 0, counter);


        System.out.println(Arrays.toString(sirNou));
    }
}
