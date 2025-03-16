import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Reader
{
    public Reader()
    {

    }

    public ArrayList<String> ReadComments(String src) throws FileNotFoundException
    {
        ArrayList<String> returnList = new ArrayList<>();
        Scanner scan = new Scanner(new File(src));
        // TODO: Logik für das seperieren der comments in Strings, Elemente getrennt mit komma.

        


        return returnList;
    }
    
}