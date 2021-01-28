import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] numbers = new int[size];

        for (int i = 0; i < size; ++i) {
            numbers[i] = scanner.nextInt();
        }

        int currentCount = 1;
        int longestSequence = 1;

        for (int i = 0; i < size - 1; ++i) {
            if (numbers[i] < numbers[i + 1]) {
                ++currentCount;
            } else {
                if (currentCount >= longestSequence) {
                    longestSequence = currentCount;
                }
                currentCount = 1;
            }
        }

        if (currentCount >= longestSequence) {
            longestSequence = currentCount;
        }

        System.out.println(longestSequence);
    }
}