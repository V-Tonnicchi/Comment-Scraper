import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Reader reader = new Reader();
        Writer writer = new Writer();
        ArrayList<String> commentlist = reader.ReadComments(null);
        writer.ExcelWrite(commentlist);
    }

}
