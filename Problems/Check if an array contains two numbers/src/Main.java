import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] numbers = new int[size];

        for (int i = 0; i < size; ++i) {
            numbers[i] = scanner.nextInt();
        }

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        boolean isNextTo = false;

        for (int i = 1; i < size; ++i) {
            if (numbers[i - 1] == n && numbers[i] == m ||
                    numbers[i - 1] == m && numbers[i] == n) {
                isNextTo = true;
                break;
            }
        }

        System.out.println(isNextTo);
    }
}