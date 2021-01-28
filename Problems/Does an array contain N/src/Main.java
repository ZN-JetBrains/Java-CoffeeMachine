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
        boolean numberExists = false;

        for (int i = 0; i < size; ++i) {
            if (numbers[i] == number) {
                numberExists = true;
                break;
            }
        }

        System.out.println(numberExists);
    }
}