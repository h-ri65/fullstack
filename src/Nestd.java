class outer1
{


    class inner1
    {
        public int name1()
        {
            System.out.println("hari");
            return 0;

        }
    }
}
public class Nestd
{
    public static void main(String[] args)
    {
      outer1 ob = new outer1();
      outer1.inner1 ob1=  ob.new inner1();
      System.out.println(ob1.name1());
    }
}
