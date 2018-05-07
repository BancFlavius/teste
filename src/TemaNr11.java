public class TemaNr11 {
    public static void main(String[] args) {

        int a[] = {1, 3, 4, 5, 7, 1, 8, 10, 12, 23, 3};

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if ((a[i] == a[j]) && (i != j)) {
                    System.out.println("Numerele duplicate se afla in pozitia " + j + ". Numerele sunt: " + a[j]);
                }
            }
        }
    }
}