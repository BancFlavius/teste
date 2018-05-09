public class TemaNr3 {
    public static void main(String[] args) {

        double lista[] = {12, 43, 21, 0, 20, 30};

        double average = 0;
        double suma = 0;

        for (int i = 0; i < lista.length; i++) {
            suma+=lista[i];
            if ( lista[i] == 0)
                break;
            average = suma / (i + 1);
        }

        System.out.println("Media aritmetica este : " + average);
    }
}
