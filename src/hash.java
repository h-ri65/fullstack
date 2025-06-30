import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class hash
{
    public static void main(String[] args)
    {
        Set<Integer> s= new TreeSet<>();
        s.add(7);
        s.add(5);
        s.add(5);
        s.add(8);
        s.add(8);
        System.out.println(s);

    }
}
