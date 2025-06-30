import java.io.File;
import java.io.FileOutputStream;

public class n
{
    public static void main(String[] args)
    {
        try(FileOutputStream ob = new FileOutputStream("two.mp3"))
        {
            System.out.println("binary file created sucessfully");
        }
        catch (Exception e)
        {
            System.out.println("error");
        }
    }
}
