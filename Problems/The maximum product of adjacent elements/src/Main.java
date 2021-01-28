import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] numbers = new int[size];

        for (int i = 0; i < size; ++i) {
            numbers[i] = scanner.nextInt();
        }

        int maxProduct = Integer.MIN_VALUE;

        for (int i = 1; i < size; ++i) {
            int product = numbers[i] * numbers[i - 1];
            if (product > maxProduct) {
                maxProduct = product;
            }
        }

        System.out.println(maxProduct);
    }
}