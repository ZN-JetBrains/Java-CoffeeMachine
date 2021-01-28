import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] numbers = new int[size];

        for (int i = 0; i < size; ++i) {
            numbers[i] = scanner.nextInt();
        }

        int number = scanner.nextInt();
        int count = 0;

        for (int i = 0; i < size; ++i) {
            if (numbers[i] == number) {
                ++count;
            }
        }

        System.out.println(count);
    }
}