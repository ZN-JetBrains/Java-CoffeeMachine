import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] numbers = new int[size];

        for (int i = 0; i < size; ++i) {
            numbers[i] = scanner.nextInt();
        }

        boolean isAscending = true;

        for (int i = 1; i < size; ++i) {
            if (numbers[i - 1] > numbers[i]) {
                isAscending = false;
            }
        }

        System.out.println(isAscending);
    }
}