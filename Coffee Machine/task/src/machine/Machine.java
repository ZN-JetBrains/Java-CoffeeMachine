package machine;

import machine.utility.Input;

/**
 * A class that represents a Coffee Machine and
 * its expected functionalities
 *
 * @author Zaid Neurothrone
 */
public class Machine
{
    public static class Menu
    {
        static final String BUY = "buy";
        static final String FILL = "fill";
        static final String TAKE = "take";
        static final String REMAINING = "remaining";
        static final String EXIT = "exit";
        static final String BACK = "back";
    }

    public static class Beverage
    {
        static final String ESPRESSO = "1";
        static final String LATTE = "2";
        static final String CAPPUCCINO = "3";
    }

    // region Fields

    final private int WATER_PER_CUP = 200;
    final private int MILK_PER_CUP = 50;
    final private int BEANS_PER_CUP = 15;

    private int myWaterCapacity;
    private int myMilkCapacity;
    private int myBeanCapacity;
    private int myCupCapacity;
    private int myMoney;

    // endregion

    // region Constructors

    /**
     * Default constructor
     */
    public Machine()
    {
        myWaterCapacity = 0;
        myMilkCapacity = 0;
        myBeanCapacity = 0;
        myCupCapacity = 0;
        myMoney = 0;
    }

    /**
     * Parameterized constructor
     *
     * @param aWaterCapacity int: the amount of water the machine has (ml)
     * @param aMilkCapacity int: the amount of milk the machine has (ml)
     * @param aBeanCapacity int: the amount of beans the machine has (g)
     * @param aCupCapacity int: the amount of disposable cups the machine has
     * @param aMoney int: the amount of money stored in the machine
     */
    public Machine(int aWaterCapacity, int aMilkCapacity, int aBeanCapacity,
                   int aCupCapacity, int aMoney)
    {
        myWaterCapacity = aWaterCapacity;
        myMilkCapacity = aMilkCapacity;
        myBeanCapacity = aBeanCapacity;
        myCupCapacity = aCupCapacity;
        myMoney = aMoney;
    }

    // endregion

    // region Properties

    public int getWaterCapacity() { return myWaterCapacity; }
    public void setWaterCapacity(int aAmount)
    {
        if (aAmount >= 0)
        {
            myWaterCapacity = aAmount;
        }
    }

    public int getMilkCapacity() { return myMilkCapacity; }
    public void setMilkCapacity(int aAmount)
    {
        if (aAmount >= 0)
        {
            myMilkCapacity = aAmount;
        }
    }

    public int getBeanCapacity() { return myBeanCapacity; }
    public void setBeanCapacity(int aAmount)
    {
        if (aAmount >= 0)
        {
            myBeanCapacity = aAmount;
        }
    }

    public int getCupCapacity() { return myCupCapacity; }
    public void setCupCapacity(int aAmount)
    {
        if (aAmount >= 0)
        {
            myCupCapacity = aAmount;
        }
    }

    public int getMoney() { return myMoney; }
    public void setMoney(int aAmount)
    {
        if (aAmount >= 0)
        {
            myMoney = aAmount;
        }
    }

    // endregion

    private int getCoffeeCups()
    {
        int cups = 0;

        while (myWaterCapacity >= WATER_PER_CUP && myMilkCapacity >= MILK_PER_CUP && myBeanCapacity >= BEANS_PER_CUP)
        {
            ++cups;
            myWaterCapacity -= WATER_PER_CUP;
            myMilkCapacity -= MILK_PER_CUP;
            myBeanCapacity -= BEANS_PER_CUP;
        }

        return cups;
    }

    public void hasSuppliesFor(int aCupsToMake)
    {
        int maxCups = getCoffeeCups();

        if (aCupsToMake > maxCups)
        {
            System.out.println("No, I can make only " + maxCups + " cup(s) of coffee");
        }
        else if (aCupsToMake == maxCups)
        {
            System.out.println("Yes, I can make that amount of coffee");
        }
        else
        {
            final int extraCups = maxCups - aCupsToMake;
            System.out.println("Yes, I can make that amount of coffee (and even " + extraCups + " more than that)");
        }
    }

    public void printInventory()
    {
        System.out.println("The coffee machine has:");
        System.out.println(getWaterCapacity() + " of water");
        System.out.println(getMilkCapacity() + " of milk");
        System.out.println(getBeanCapacity() + " of coffee beans");
        System.out.println(getCupCapacity() + " of disposable cups");
        if (myMoney == 0)
        {
            System.out.println(getMoney() + " of money");
        }
        else
        {
            System.out.println("$" + getMoney() + " of money");
        }
    }

    public boolean getAction()
    {
        System.out.println("Write action (buy, fill, take, remaining, exit):");
        String userInput = Input.getString();

        // TODO: Remove later: Currently used to fit tests
        System.out.println();

        switch (userInput)
        {
            case Menu.BUY:
                buyBeverage();
                break;
            case Menu.FILL:
                fillInventory();
                break;
            case Menu.TAKE:
                takeMoney();
                break;
            case Menu.REMAINING:
                printInventory();
                break;
            case Menu.EXIT:
                return false;
            default:
                break;
        }

        // TODO: Remove later: Currently used to fit tests
        System.out.println();

        return true;
    }

    private void buyBeverage()
    {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String userInput = Input.getString();

        switch (userInput)
        {
            case Menu.BACK:
                return;
            case Beverage.ESPRESSO:
                buyEspresso();
                break;
            case Beverage.LATTE:
                buyLatte();
                break;
            case Beverage.CAPPUCCINO:
                buyCappuccino();
                break;
            default:
                break;
        }
    }

    private void buyEspresso()
    {
        final int waterCost = 250;
        final int beanCost = 16;
        final int moneyCost = 4;

        canPurchase(waterCost, 0, beanCost, moneyCost);
    }

    private void buyLatte()
    {
        final int waterCost = 350;
        final int milkCost = 75;
        final int beanCost = 20;
        final int moneyCost = 7;

        canPurchase(waterCost, milkCost, beanCost, moneyCost);
    }

    private void buyCappuccino()
    {
        final int waterCost = 200;
        final int milkCost = 100;
        final int beanCost = 12;
        final int moneyCost = 6;

        canPurchase(waterCost, milkCost, beanCost, moneyCost);
    }

    private boolean canPurchase(int aWaterCost, int aMilkCost, int aBeanCost, int aMoneyCost)
    {
        if (aWaterCost > myWaterCapacity)
        {
            System.out.println("Sorry, not enough water!");
            return false;
        }
        if (aMilkCost > myMilkCapacity)
        {
            System.out.println("Sorry, not enough milk!");
            return false;
        }
        if (aBeanCost > myBeanCapacity)
        {
            System.out.println("Sorry, not enough beans!");
            return false;
        }
        if (myCupCapacity < 1)
        {
            System.out.println("Sorry, not enough cups!");
            return false;
        }

        System.out.println("I have enough resources, making you a coffee!");

        myMoney += aMoneyCost;
        --myCupCapacity;
        myWaterCapacity -= aWaterCost;
        myMilkCapacity -= aMilkCost;
        myBeanCapacity -= aBeanCost;

        return true;
    }

    private void fillInventory()
    {
        final int minCapacity = 0;
        final int maxCapacity = 1_000_000;

        System.out.println("Write how many ml of water do you want to add:");
        int waterToAdd = Input.getInt(minCapacity, maxCapacity);
        setWaterCapacity(getWaterCapacity() + waterToAdd);

        System.out.println("Write how many ml of milk do you want to add:");
        int milkToAdd = Input.getInt(minCapacity, maxCapacity);
        setMilkCapacity(getMilkCapacity() + milkToAdd);

        System.out.println("Write how many grams of coffee beans do you want to add:");
        int beansToAdd = Input.getInt(minCapacity, maxCapacity);
        setBeanCapacity(getBeanCapacity() + beansToAdd);

        System.out.println("Write how many disposable cups of coffee do you want to add:");
        int cupsToAdd = Input.getInt(minCapacity, maxCapacity);
        setCupCapacity(getCupCapacity() + cupsToAdd);
    }

    private void takeMoney()
    {
        System.out.println("I gave you $" + myMoney);
        setMoney(0);
    }
}
