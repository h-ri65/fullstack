import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
public class Q
{
    public static void main(String[] args)
    {
        Queue<String> Q = new LinkedList<>();
        Q.offer("a");
        Q.offer("b");
        Q.offer("c");
        Q.add("aa");
        Q.add("bb");
        System.out.println(Q);
        Q.remove();
        System.out.println(Q);
        Q.poll();
        System.out.println(Q);
        Q.isEmpty();
        System.out.println(Q);
        Q.poll();
        System.out.println(Q);
        Q.clear();
        System.out.println(Q);
    }
}
