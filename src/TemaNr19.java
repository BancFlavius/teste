import java.util.Arrays;

public class TemaNr19 {
    public static void main(String[] args) {
        int sirNesortat[] = {1,3,2,6,4,5,5,12};
        int sirSortat[] = new int[sirNesortat.length];
        int a;

        for (int i = 0; i < sirNesortat.length - 1; i++) {
            for (int j = i; j < sirNesortat.length; j++) {
                if(sirNesortat[i] > sirSortat[j]) {
                    a = sirNesortat[i];
                    sirNesortat[i] = sirNesortat[j];
                    sirNesortat[j] = a;
                    sirSortat = sirNesortat;

                }
            }
        }
        System.out.println(Arrays.toString(sirSortat));
    }
}
