class  abc
{
    void disp()
    {
        class ac
        {
            void dis(String name,int num)
            {
                System.out.println(name+"\t"+num);
            }
        }
        ac ob = new ac();
        ob.dis("hari",10);
    }
}
public class fe
{
    public static void main(String[] args)
    {
      abc obj = new abc();
      obj.disp();
    }
}