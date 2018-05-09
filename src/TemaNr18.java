public class TemaNr18 {
    public static void main(String[] args) {

        int x = 2;
        int n = 4;
        int putere = 1;

        for(int i = 1; i <= n; i++){
            putere+=(int)Math.pow(x, i);
        }
        System.out.println(putere);
    }
}
