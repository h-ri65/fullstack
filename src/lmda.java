interface  Z
{
    void sum(int xy, int yx);
}
interface ZZ
{
    void dif(int ab, int ba);
}
interface ZZZ
{
    void mul(int c , int d);
}


public class lmda
{
    public static void main(String[] args)
    {
        Z obj=(xy,yx) -> System.out.println(xy+yx);
        obj.sum(1,2);
        ZZ obj1=(ab,ba) -> System.out.println(ab-ba);
        obj1.dif(5,2);
        ZZZ obj2=(c,d) -> System.out.println(c*d);
        obj2.mul(4,2);


    }
}
