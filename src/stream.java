import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class stream

{
    public static void main(String[] args)
    {
        String file= "abc.txt";
        try
        {
            Files.write(Paths.get(file),"welcome to y".getBytes());
            System.out.println("file created sucessfully");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try(FileReader ob = new FileReader("abc.txt"))
        {

           int box;
           while ((box = ob.read()) != -1)
            {

              System.out.print((char)box);
        }


    } catch (FileNotFoundException e)
        {
            throw new RuntimeException(e);
        } catch (IOException e)
        {
            throw new RuntimeException(e);
        }
      

    }
}
