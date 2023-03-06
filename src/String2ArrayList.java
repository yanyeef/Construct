import java.util.ArrayList;
public class String2ArrayList
{
    private ArrayList<String> splitString;

    public String2ArrayList()
    {
        //Construct the splitString here!
        splitString = new ArrayList<String>();
    }
    public void splitAndAdd(String str)
    {
        //split the string into single character strings 
        //and add them ot splitString
        for(int i = 0; i < str.length(); i++){
            splitString.add(str.substring(i, i+1));
        }
    }
    public String toString()
    {
        return splitString + "";
    }
}