import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] numbers = new int[size];

        for (int i = 0; i < size; ++i) {
            numbers[i] = scanner.nextInt();
        }

        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < size; ++i) {
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }

        System.out.println(smallest);
    }
}