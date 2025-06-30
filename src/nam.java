class outer2
{


    class inner2
    {
        public void name()
        {
           System.out.println("Hari");
        }
    }
    void disp()
    {
        inner2 ob= new inner2();
        ob.name();
    }
}



public class nam {
    public static void main(String[] args) {
    outer2 ob1=new outer2();
    ob1.disp();
    }
}
