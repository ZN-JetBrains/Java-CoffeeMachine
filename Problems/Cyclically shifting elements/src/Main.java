import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] numbers = new int[size];

        for (int i = 0; i < size; ++i) {
            numbers[i] = scanner.nextInt();
        }

        int[] shiftedNumbers = new int[size];

        for (int i = 0; i < size; ++i) {
            if (i == 0) {
                shiftedNumbers[i] = numbers[size - 1];
            } else {
                shiftedNumbers[i] = numbers[i - 1];
            }
        }

        for (int num : shiftedNumbers) {
            System.out.print(num + " ");
        }
    }
}