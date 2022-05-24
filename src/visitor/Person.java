package visitor;

import elements.GroceryStore;
import elements.Library;
import interfaces.IPerson;


/**
 * This class represents a Person and serves as a concrete visitor
 * @author Jake Donaldson
 * @version 5/24/22
 */
public class Person implements IPerson
{

    public static final int NOON = 12;

    @Override
    public String visit(GroceryStore groceryStore)
    {
        String result = "";
        if(groceryStore.getOpeningTime() < NOON)
        {
            result = "I will be going to the Grocery Store this morning at ";
            result = result + groceryStore.getOpeningTime() + "AM. My GPS says the address is ";
            result = result + groceryStore.getAddress();
            return result;
        }
        else if(groceryStore.getOpeningTime() == NOON)
        {
            result = "I will be going to the Grocery Store this afternoon at ";
            result = result + groceryStore.getOpeningTime() + "PM. My GPS says the address is ";
            result = result + groceryStore.getAddress();
            return result;
        }
        else
        {
            result = "I will be going to the Grocery Store this afternoon at ";
            result = result + (groceryStore.getOpeningTime() - NOON) + "PM. My GPS says the address is ";
            result = result + groceryStore.getAddress();
            return result;
        }
    }

    @Override
    public String visit(Library library)
    {
        return library.getName() + " Public Library - noise level: " + library.getVolumeLevel();
    }
}
