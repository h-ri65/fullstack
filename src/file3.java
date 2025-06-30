import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class file3
{
    public static void main(String[] args) throws IOException {
        String a="abce.txt";
        File ob = new File(a);
        FileWriter writer= new FileWriter(ob);
        writer.write("hello dev");
        writer.write("hi");
        System.out.println("sucess");
        writer.close();
    }
}
