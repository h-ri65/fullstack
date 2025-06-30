import java.io.FileInputStream;
import java.io.FileReader;

public class file6
{
    public static void main(String[] args)
    {
      String a="picture/demo.jpg";
      try(FileInputStream ob = new FileInputStream(a))
      {
          int character;
          while((character=ob.read())!=-1)
          {
              System.out.print((char)character);

          }

      }
      catch (Exception e)
      {
          System.out.println("eror");
      }
    }
}
