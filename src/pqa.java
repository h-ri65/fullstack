import java.util.ArrayDeque;
import java.util.Stack;

public class pqa
{
    public static void main(String[] args)
    {
        Stack<String> A = new Stack<>();
        A.push("bob");
        A.push("veethi");
        A.push("aiay");
        A.pop();
     System.out.println(   A.search("bob"));

        System.out.println(A);
    }
}
