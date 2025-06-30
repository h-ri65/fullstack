import java.util.Scanner;

class h
{
    Scanner sc= new Scanner(System.in);
void add(int a ,int b)
{

    System.out.println(a+b);
}
    void add(int a ,int b,int c)
    {

        System.out.println(a+b+c);
    }
}
class deci extends  h
{
    void dec(int c)
    {
        switch (c)
        {
            case 1:
                System.out.println("enter two numbers");
                int a= sc.nextInt();
                int b= sc.nextInt();
                add(a,b);
                break;

        }

    }
}



public class all1 {
    public static void main(String[] args)
        {
            Scanner sc= new Scanner(System.in);

            System.out.println("enyter the dec");
            int c=sc.nextInt();
            deci ob = new deci();
            ob.dec(c);



        }
}
