package machine;

/**
 * A class that represents a Coffee Machine and
 * its expected functionalities
 *
 * @author Zaid Neurothrone
 */
public class Machine
{
    // Fields
    final private int WATER_PER_CUP = 200;
    final private int MILK_PER_CUP = 50;
    final private int BEANS_PER_CUP = 15;

    private int myWaterCapacity;
    private int myMilkCapacity;
    private int myBeanCapacity;

    /**
     * Default constructor
     */
    public Machine()
    {
        myWaterCapacity = 0;
        myMilkCapacity = 0;
        myBeanCapacity = 0;
    }

    /**
     * Parameterized constructor
     *
     * @param aWaterCapacity int: the amount of water the machine has (ml)
     * @param aMilkCapacity int: the amount of milk the machine has (ml)
     * @param aBeanCapacity int: the amount of beans the machine has (g)
     */
    public Machine(int aWaterCapacity, int aMilkCapacity, int aBeanCapacity)
    {
        myWaterCapacity = aWaterCapacity;
        myMilkCapacity = aMilkCapacity;
        myBeanCapacity = aBeanCapacity;
    }

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

    private int cupCapacity()
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
        int maxCups = cupCapacity();

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
}
