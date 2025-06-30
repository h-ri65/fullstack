import java.io.File;
import java.io.FileWriter;

public  class filehello


{
    public static void main(String[] args)
    {
      String a="a.txt";
      File file=new File(a);
      try
      {
          if (file.createNewFile())
          {
              System.out.println("sucess");
          }
          else
          {
              System.out.println("error");
          }
          FileWriter writer=new FileWriter(file);
          writer.write("hello");
          System.out.println("inserted");
          writer.close();

      }
      catch (Exception e)
      {
        System.out.println("error");
      }
      }
}
