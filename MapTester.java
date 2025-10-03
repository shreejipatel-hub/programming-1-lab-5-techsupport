import java.util.HashMap;
/**
 * Write a description of class MapTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MapTester
{
    // instance variables - replace the example below with your own
        private HashMap<String,String> phonebook;
    /**
     * Constructor for objects of class MapTester
     */
    public MapTester()
    {
        phonebook = new HashMap<String,String>();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void enterNumber(String name, String number)
    {
        phonebook.put(name, number);
    }
    
    public String lookupNumber(String name)
    {
        return phonebook.get(name);
    }
}

