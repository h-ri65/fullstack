import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.PriorityBlockingQueue;


public class sq
{
    public static void main(String[] args)
    {
        Queue<String> ob = new LinkedList<>();
        ob.add("ihtpeed");
        System.out.println(ob);

            String len=(ob.remove());
            int l = len.length();
            String m = "";
            System.out.println(l);
        for(int i=l-1;i>=0;i--)
        {
            m=m+len.charAt(i);
        }
        System.out.println(m);



    }
}
