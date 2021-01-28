import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = 3;

        int[] box1 = new int[size];
        for (int i = 0; i < size; ++i) {
            box1[i] = scanner.nextInt();
        }

        int[] box2 = new int[size];
        for (int i = 0; i < size; ++i) {
            box2[i] = scanner.nextInt();
        }

        Arrays.sort(box1);
        Arrays.sort(box2);

        if (box1[0] < box2[0] && box1[1] < box2[1] && box1[2] < box2[2]) {
            System.out.println("Box 1 < Box 2");
        } else if (box2[0] < box1[0] && box2[1] < box1[1] && box2[2] < box1[2]) {
            System.out.println("Box 1 > Box 2");
        } else {
            System.out.println("Incompatible");
        }
    }
}