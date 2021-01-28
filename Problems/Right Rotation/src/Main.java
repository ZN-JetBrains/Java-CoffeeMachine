import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] strNumbers = scanner.nextLine().trim().split(" ");
        int size = strNumbers.length;
        int[] numbers = new int[size];

        for (int i = 0; i < size; ++i) {
            numbers[i] = Integer.parseInt(strNumbers[i]);
        }

        int rotations = scanner.nextInt();
        if (rotations >= 10_000) {
            rotations %= size;
        }

        int[] shiftedNumbers = new int[size];

        for (int r = 0; r < rotations; ++r) {
            for (int i = 0; i < size; ++i) {
                if (i == 0) {
                    shiftedNumbers[i] = numbers[size - 1];
                } else {
                    shiftedNumbers[i] = numbers[i - 1];
                }
            }

            System.arraycopy(shiftedNumbers, 0, numbers, 0, size);
        }

        for (int num : shiftedNumbers) {
            System.out.print(num + " ");
        }
    }
}