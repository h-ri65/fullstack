
interface F
{
    void add(int a, int b);
    void sub(int c, int d);

}
interface G
{
    void mul(int e, int f);
    void div(int g, int h);
}

public class divint {
    public static void main(String[] args)
    {
        F ob= new F()
        {
            @Override
            public void add(int a, int b) {
                System.out.println(a + b);
            }
            public void sub(int c, int d) {
                System.out.println(c-d);
            }
        };
        G ob1= new G()
        {
            @Override
            public void mul(int e, int f) {
                System.out.println(e*f);

            }

            @Override
            public void div(int g, int h) {
                System.out.println(g/h);

            }


        };
        ob.add(2,4);
        ob.sub(4,5);
        ob1.div(10,5);
        ob1.mul(2,2);
    }
}
