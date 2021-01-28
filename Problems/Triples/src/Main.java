import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] numbers = new int[size];

        for (int i = 0; i < size; ++i) {
            numbers[i] = scanner.nextInt();
        }

        int count = 0;

        for (int i = 1; i < size - 1; ++i) {
            if (numbers[i - 1] == numbers[i] - 1 &&
                    numbers[i + 1] == numbers[i] + 1) {
                ++count;
            }
        }

        System.out.println(count);
    }
}