import java.io.File;
import java.io.IOException;

public class file
{
    public static void main(String[] args) throws IOException {
       //String ab="abcd.pdf";
        File ob = new File("a.pdf");
        if(ob.createNewFile())
        {
            System.out.println("file created ");
        }
        else
        {
            System.out.println("try again");
        }
    }
}
