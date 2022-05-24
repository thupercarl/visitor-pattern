package interfaces;

/**
 * This interface is used by different Errand (element) objects to accept visitors
 * @author Jake Donaldson
 * @version 5/24/22
 */
public interface IErrand
{
    /**
     * @param visitor visitor object to be accepted
     * @return String representation of visitor's response
     */
    String accept(IPerson visitor);
}
