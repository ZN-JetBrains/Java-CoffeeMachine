package machine;

import machine.utility.Input;

/**
 * The coffee machine class calculates how much of each
 * ingredient is necessary to make a coffee cup that's
 * required for a specified amount of cups
 *
 * @author Zaid Neurothrone
 */
public class CoffeeMachine
{
    public static void main(String[] args)
    {
        run();
    }

    private static void run()
    {
        Machine machine = new Machine(
                400,
                540,
                120,
                9,
                550);

        machine.printInventory();
        System.out.println();

        machine.getAction();

        System.out.println();
        machine.printInventory();
    }
}
