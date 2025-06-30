class AC
{
    static class BC
    {
        void sum(int a, int b)
        {
            System.out.println("sum="+a+b);
        }
        void dif(int a, int b)
        {
            System.out.println("diff="+(a-b));
        }

        void mul(int a, int b)
        {
            System.out.println("prod="+a*b);
        }

        void div(int a, int b)
        {
            System.out.println("div="+a/b);
        }


    }
}
public class aab {
    public static void main(String[] args)
    {
        AC.BC oob= new AC.BC();
        oob.sum(6,3);
        oob.dif(6,3);
        oob.mul(6,3);
        oob.div(6,3);
    }
}
