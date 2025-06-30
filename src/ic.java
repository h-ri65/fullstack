class one
{
    void show()
    {
        class two
        {
            void persn(String name,int age)
            {
                System.out.println(name+"\t"+age);
            }
            void dog(String nme,String breed)
            {
                System.out.println(nme+"\t"+breed);
            }

        }
        two obj= new two();
        obj.persn("hari",22);
        obj.dog("mily","white");
    }
}
public class ic {
    public static void main(String[] args) {
        one ob = new one();
        ob.show();
    }
}
