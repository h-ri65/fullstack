interface i1
{
    public  void vehicle(int vno,  String color);
    public void vsound(String vsound);
}
interface i2 extends i1
{
    public void car(String cname, String ccolor,double cprice);
    public void csound(String csound);
}
interface i3 extends i1
{
    public void bike(String bname,double bprice,String eno);
    public void bsound(String bsound);
}
class cad implements i3, i2

{
    @Override
    public void vehicle(int vno,  String color)
    {
     System.out.println(vno+"\t"+color);
    }

    @Override
    public void vsound(String vsound)
    {
    System.out.println("vsound="+vsound+"\n");
    }

    @Override
    public void car(String cname, String ccolor,double cprice)
    {
    System.out.println(cname+"\t"+ccolor+""+cprice);
    }

    @Override
    public void csound(String csound) {
        System.out.println("csound="+csound+"\n");
    }
    @Override
    public void bike(String bname,double bprice,String eno){
        System.out.println(bname+"\t"+bprice+"\t"+eno+"\n");
    }
    public void bsound(String bsound)
    {
        System.out.println(bsound);
    }

}

public class encp

    {

    public static void main(String[] args)
    {
        cad ob = new cad();
       ob.vehicle(1,"black");
       ob.vsound("a");
       ob.bike("zx10r",10000.0,"1234");
       ob.bsound("b");
       ob.car("mustang","red",25000.0);
       ob.csound("c");
    }

}

