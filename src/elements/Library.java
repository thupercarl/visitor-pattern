package elements;

import interfaces.IErrand;
import interfaces.IPerson;

/**
 * This class represents a Library Errand
 * @author Jake Donaldson
 * @version 5/24/22
 */
public class Library implements IErrand
{
    private String name;
    private int volumeLevel;

    /**
     * Constructs a Library object
     * @param name the name of the Library
     * @param volumeLevel the Volume Level inside the Library
     */
    public Library(String name, int volumeLevel)
    {
        this.name = name;
        this.volumeLevel = volumeLevel;
    }


    /**
     * @return String name of the Library
     */
    public String getName()
    {
        return name;
    }


    /**
     * @return int Volume inside the Library
     */
    public int getVolumeLevel()
    {
        return volumeLevel;
    }

    @Override
    public String accept(IPerson visitor)
    {
        return visitor.visit(this);
    }

    @Override
    public String toString() {
        return "Library{" +
                "name='" + name + '\'' +
                ", volumeLevel=" + volumeLevel +
                '}';
    }
}
