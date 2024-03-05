public class Main {
    public static void main(String[] args) {
        int[] numbers = {7, 8, 9, 10, 11};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        System.out.println(sum / numbers.length);
    }
}