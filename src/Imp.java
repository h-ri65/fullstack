class Outer
{
    class inner
    {
        void emp(String  name, int id)
        {
            System.out.println("Emp_name="+name+"Emp_id="+id);
        }
        void dept(String  dname, int did)
        {
            System.out.println("Department name="+dname+"Department id="+did);
        }
    }
    void dis()
    {
        inner ob = new inner();
        ob.emp("hari\n",22);
        ob.dept("abc",25);
    }
}



public class Imp {
    public static void main(String[] args)
    {
        Outer ob1= new Outer();
        ob1.dis();
    }
}
