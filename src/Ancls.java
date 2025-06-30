abstract class A
{
    abstract void dog(String name,String color);
    abstract  void cat(String name1,String color1);
}
public class Ancls {
    public static void main(String[] args) {
        A obj=new A()
        {
          void dog(String name,String color)
          {
              System.out.println(name+"\t"+color);
          }
            void cat(String name1,String color1)
            {
                System.out.println(name1+"\t"+color1);
            }
        };
        obj.dog("abc","black");
        obj.cat("def","orange");
    }
}
