import java.util.Scanner;

public class Main {

    public static boolean isVowel(char ch) {
        char letter = Character.toLowerCase(ch);
        return letter == 'a' || letter == 'e' || letter == 'i' ||
                letter == 'o' || letter == 'u';
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        System.out.println(isVowel(letter) ? "YES" : "NO");
    }
}