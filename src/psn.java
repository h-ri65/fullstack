interface CC
{
    void person(String name,int age,String address);
}
public class psn
{
    public static void main(String[] args) {
        CC ob = ((name, age, address) -> System.out.println(name+" "+address+""+age));
        ob.person("hari",22,"banglore");

    }
}

