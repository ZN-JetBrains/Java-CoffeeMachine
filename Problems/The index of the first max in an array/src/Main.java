import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] numbers = new int[size];

        for (int i = 0; i < size; ++i) {
            numbers[i] = scanner.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int indexOfMax = 0;

        for (int i = 0; i < size; ++i) {
            if (numbers[i] > max) {
                max = numbers[i];
                indexOfMax = i;
            }
        }

        System.out.println(indexOfMax);
    }
}