import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().split(" ");

        boolean isOrdered = true;

        for (int i = 1; i < strings.length; ++i) {
            if (strings[i - 1].compareTo(strings[i]) > 0) {
                isOrdered = false;
            }
        }

        System.out.println(isOrdered);
    }
}