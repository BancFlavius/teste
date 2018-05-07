public class TemaNr2 {
    public static void main(String[] args) {

        double lista[] = {10, 40, 20, 1234, 123, 654, 9785};

        double average;
        double sum = 0;

        for (int i = 0; i < lista.length; i++) {
            sum = sum + lista[i];
        }

        average = sum / lista.length;

        System.out.println("Media aritmetica este : " + average);
    }
}
