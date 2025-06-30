abstract class ab
{
    abstract void student(String name,String sbranch);
}
abstract class bc
{
    abstract  void employee(String ename,String role);
}
public class nw {
    public static void main(String[] args) {
        ab ob=new ab()
        {
            void student(String name,String sbranch)
            {
                System.out.println(name+"\t"+sbranch);
            }
        };
        bc ob1= new bc()
        {
          void employee(String ename,String role)
          {
              System.out.println(ename+"\t"+role);
          }
        };
        ob.student("abc","CSE");
        ob1.employee("XYZ","developer");
    }
}
