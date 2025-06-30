interface X
{
    void add(int a, int b);
    void sub(int c, int d);
}

public class intr {
    public static void main(String[] args)
    {
        X ob= new X()
        {
            @Override
            public void add(int a, int b)
            {
                System.out.println(a+b);
            }

            @Override
            public void sub(int c, int d) {
            System.out.println(c-d);
            }

        };
        ob.add(2,4);
        ob.sub(4,1);
    }
}
