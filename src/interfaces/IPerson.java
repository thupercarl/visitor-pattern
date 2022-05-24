package interfaces;

import elements.GroceryStore;
import elements.Library;

/**
 * This interface is used by Person (visitor) objects to talk to different Elements
 * @author Jake Donaldson
 * @version 5/24/22
 */
public interface IPerson
{
    /**
     * @param groceryStore the object being visited
     * @return String response from visitor
     */
    String visit(GroceryStore groceryStore);

    /**
     * @param library the object being visited
     * @return String response from visitor
     */
    String visit(Library library);
}
//adding classes require more visit methods
