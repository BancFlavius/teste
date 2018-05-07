public class TemaNr6 {
    public static void main(String[] args) {

        int numbers[] = new int[]{2, 5, 15};

        int smallest = numbers[0];
        int largest = numbers[0];

        for(int i=0; i < numbers.length; i++){
            if(numbers[i] > largest)
                largest = numbers[i];
            else if (numbers[i] < smallest)
                smallest = numbers[i];
        }

        int sum = 0;

        for(int i=0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }

        double average = sum / numbers.length;

        System.out.println("Cel mai mare numar este: " + largest);
        System.out.println("Cel mai mic numar este: " + smallest);
        System.out.println("Suma lor este: " + sum);
        System.out.println("Media aritmetica este: " + average);
    }
}

