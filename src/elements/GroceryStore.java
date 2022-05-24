package elements;

import interfaces.IErrand;
import interfaces.IPerson;

/**
 * This class represents a GroceryStore Errand
 * @author Jake Donaldson
 * @version 5/24/22
 */
public class GroceryStore implements IErrand
{
    private String address;
    private int openingTime;


    /**
     * Constructs a GroceryStore object
     * @param address the location of the GroceryStore
     * @param openingTime the opening
     */
    public GroceryStore(String address, int openingTime)
    {
        this.address = address;
        this.openingTime = openingTime;
    }


    /**
     * @return String address of GroceryStore
     */
    public String getAddress()
    {
        return address;
    }


    /**
     * @return int opening time of GroceryStore
     */
    public int getOpeningTime()
    {
        return openingTime;
    }

    @Override
    public String accept(IPerson visitor)
    {
        return visitor.visit(this);
    }

    @Override
    public String toString() {
        return "GroceryStore{" +
                "address='" + address + '\'' +
                ", openingTime=" + openingTime +
                '}';
    }
}
