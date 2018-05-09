public class TemaNr17 {
    public static void main(String[] args) {
        int lista[] = {231,1,23,411,1223,41,1,23};

        for(int i = 0; i < (lista.length - 1); i++){
            if (lista[i] > lista[i + 1]) {
                System.out.println("Perechile sunt: " + lista[i] + ", " + lista[i + 1]);
            }
        }
    }
}
