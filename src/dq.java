import java.util.ArrayDeque;

public class dq
{
    public static void main(String[] args)
    {
        ArrayDeque<Integer> A = new ArrayDeque<>();
        A.addFirst(1);
        A.addFirst(2);
        A.addLast(3);
        A.addLast(4);
        System.out.println(A);
    }
}
