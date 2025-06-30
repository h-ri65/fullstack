
interface D
{
    void add(int a, int b);

}
interface E
{

    void sub(int c, int d);
}

public class multint {
    public static void main(String[] args)
    {
        D ob= new D() {
            @Override
            public void add(int a, int b) {
                System.out.println(a + b);
            }
        };
E ob1= new E(){
            @Override
            public void sub(int c, int d) {
                System.out.println(c-d);
            }

        };
        ob.add(2,4);
        ob1.sub(4,1);
    }
}
