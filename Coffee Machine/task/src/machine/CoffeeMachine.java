package machine;

import machine.utility.Input;

/**
 * The coffee machine class calculates how much of each
 * ingredient is necessary to make a coffee cup that's
 * required for a specified amount of cups
 *
 * @author Zaid Neurothrone
 */
public class CoffeeMachine {
    public static void main(String[] args) {
        final int minCapacity = 0;
        final int maxCapacity = 1_000_000;
        Machine machine = new Machine();

        System.out.println("Write how many ml of water the coffee machine has:");
        int waterCapacity = Input.getInt(minCapacity, maxCapacity);
        machine.setWaterCapacity(waterCapacity);

        System.out.println("Write how many ml of milk the coffee machine has:");
        int milkCapacity = Input.getInt(minCapacity, maxCapacity);
        machine.setMilkCapacity(milkCapacity);

        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int beanCapacity = Input.getInt(minCapacity, maxCapacity);
        machine.setBeanCapacity(beanCapacity);

        System.out.println("Write how many cups of coffee you will need:");
        int cupsNeeded = Input.getInt(minCapacity, maxCapacity);

        // OUT result
        machine.hasSuppliesFor(cupsNeeded);
    }
}
