package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        int waterPerCup = 200;
        int milkPerCup = 50;
        int coffeeBeansPerCup = 15;

        System.out.println("Write how many cups of coffee you will need:");
        Scanner scanner = new Scanner(System.in);
        int cups = scanner.nextInt();

        System.out.println("For " + cups + " cups of coffee you will need:");
        System.out.println(cups * waterPerCup + " ml of water");
        System.out.println(cups * milkPerCup + " ml of milk");
        System.out.println(cups * coffeeBeansPerCup + " g of coffee beans");
    }
}
