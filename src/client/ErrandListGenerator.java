package client;

import elements.GroceryStore;
import elements.Library;
import interfaces.IErrand;
import interfaces.IPerson;
import visitor.Person;


/**
 * This class implements the visitor pattern to create a list of errands
 * @author Jake Donaldson
 * @version 5/24/22
 */
public class ErrandListGenerator
{

    public static final int NOON = 12;
    public static final int THREE_PM = 15;

    /**
     * @param args String array holding arguments in the program
     */
    public static void main(String[] args)
    {
        IErrand[] places = new IErrand[]
                {
                    new GroceryStore("123 Elm St", 9),
                    new Library("Donaldson", 10),
                    new GroceryStore("Renton Landing", NOON),
                    new GroceryStore("Kent Station", THREE_PM),
                    new Library("Rutherford & Moore", 2)
                };
        String errandList = createErrandList(places);
        System.out.println(errandList);
    }

    //puts together errand list
    private static String createErrandList(IErrand[] places)
    {
        IPerson visitor = new Person();
        StringBuilder errands = new StringBuilder("Errands: \r\n");

        for (IErrand place : places)
        {
            errands.append(place.accept(visitor)).append("\r\n");
        }
        return errands.toString();
    }
}
