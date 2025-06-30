import java.util.LinkedList;
import java.util.PriorityQueue;

public class pq
{
    public static void main(String[] args)
    {
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        pq.add(4);
        pq.add(2);
        pq.add(9);
        pq.add(21);
        pq.add(0);
        System.out.println(pq);
        System.out.println(pq.peek());


    }
}
