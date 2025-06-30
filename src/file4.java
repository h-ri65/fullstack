import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class file4
{
    public static void main(String[] args)
    {
      String a= "abce.csv";
      String content ="hello how are you banglore";
      try(FileOutputStream fos= new FileOutputStream(a))
      {
          byte[] bytes=content.getBytes();
          fos.write(bytes);
          System.out.println("good");
          fos.close();
      }
      catch (Exception e)
      {

      }
    }
}
