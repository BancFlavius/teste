public class TemaNr3 {
    public static void main(String[] args) {

        double lista[] = {12, 43, 21, 0, 20, 30};

        double average = 0;
        double sum = 0;

        for (int i = 0; i < lista.length; i++) {
            sum = sum + lista[i];
            if ( lista[i] == 0)
                break;
            average = sum / (i + 1);
        }

        System.out.println("Media aritmetica este : " + average);
    }
}
