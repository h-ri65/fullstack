import java.util.HashSet;
import java.util.Set;
public class hs
{
    public static void main(String[] args)
    {
        Set<Integer> s= new HashSet<>();
        s.add(1);
        s.add(0);
        s.add(4);

        System.out.println(s);
        s.remove(11);
        System.out.println(s);

    }
}
