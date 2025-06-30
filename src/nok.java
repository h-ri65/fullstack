import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class nok
{
    public static void main(String[] args)
    {
        List<Integer> ln = Arrays.asList(1, 2, 3, 4);
        Consumer<Integer> obj =i->System.out.println(i);
        ln.forEach(obj);
        }
    }

