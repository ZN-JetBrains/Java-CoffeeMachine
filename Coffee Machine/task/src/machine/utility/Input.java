package machine.utility;

import java.util.Scanner;

/**
 * A class with reusable static methods for user input, file input
 *
 * @author Zaid Neurothrone
 */
public class Input
{
    static Scanner scanner = new Scanner(System.in);

    /**
     * Scans for an integer from user input by the user until
     * a valid one is entered and returns it
     *
     * @return the integer entered by the user
     */
    public static int getInt()
    {
        int userInput = Integer.MIN_VALUE;

        while (true)
        {
            if (scanner.hasNextInt())
            {
                userInput = scanner.nextInt();
                break;
            }
            else
            {
                scanner.nextLine();
                System.out.println("[Error]: That is not an integer. Try again.");
            }
        }
        return userInput;
    }

    /**
     * Scans for an integer from user input in a range specified
     * by the user until a valid one is entered and returns it
     *
     * @param aMin the minimum allowed int to scan for
     * @param aMax the maximum allowed int to scan for
     * @return the integer entered by the user
     */
    public static int getInt(int aMin, int aMax)
    {
        int userInput = Integer.MIN_VALUE;

        while (userInput < aMin || userInput > aMax)
        {
            if (scanner.hasNextInt())
            {
                userInput = scanner.nextInt();

                if (userInput < aMin || userInput > aMax)
                {
                    System.out.println("[Error]: Enter only an integer in the range " + aMin + " to " + aMax  + ".");
                }
            }
            else
            {
                scanner.nextLine();
                System.out.println("[Error]: That is not an integer. Try again.");
            }
        }
        return userInput;
    }
}
