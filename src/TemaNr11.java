import java.util.Scanner;

public class TemaNr11 {
    public static void main(String[] args) {

        int numar;
        int x = -1;
        int a[] = {1, 3, 4, 5, 7, 1, 8, 10, 12, 23, 3};
        Scanner input = new Scanner(System.in);

        System.out.print("Introduceti un numar: ");
        numar = input.nextInt();

        for(int i = 0; i < a.length;i++){
            if ( numar == a[i]) {
                System.out.println("PoZitia acestui numar se afla la indexu-ul: " + i);
                x = numar;
            }
        }
        if ( x != numar)
            System.out.println(x);

//        for (int i = 0; i < a.length; i++) {
//            for (int j = i + 1; j < a.length; j++) {
//                if ((a[i] == a[j]) && (i != j)) {
//                    System.out.println("Numerele duplicate se afla in pozitia " + j + ". Numerele sunt: " + a[j]);
//                }
//            }
//        }


    }
}