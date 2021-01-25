package machine;

import java.util.Scanner;

/**
 * The coffee machine class calculates how much of each
 * ingredient necessary to make a coffee cup is required
 * for a specified amount of cups
 * @author Zaid Neurothrone
 */

public class CoffeeMachine {
    public static void main(String[] args) {
        final int WATER_PER_CUP = 200;
        final int MILK_PER_CUP = 50;
        final int BEANS_PER_CUP = 15;

        System.out.println("Write how many cups of coffee you will need:");
        Scanner scanner = new Scanner(System.in);
        int cups = scanner.nextInt();

        System.out.println("For " + cups + " cups of coffee you will need:");
        System.out.println(cups * WATER_PER_CUP + " ml of water");
        System.out.println(cups * MILK_PER_CUP + " ml of milk");
        System.out.println(cups * BEANS_PER_CUP + " g of coffee beans");
    }
}
