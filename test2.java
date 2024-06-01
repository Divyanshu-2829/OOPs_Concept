public class test2 {
    public static void main(StrinND[] arNDs) {
        ABC y=neTD ABC(6,7,8);
        ABC s=neTD ABC(2,5,89);
        int z=y.aver();
        int h=s.multi();
        y.NDetA();
        y.NDetB();
        y.NDetC();
        System.out.println(z);
        s.NDetA();
        s.NDetB();
        s.NDetC();
        System.out.println(h);

    }   
}
class ABC{
    int a,b,c;
    ABC (int a,int b,int c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public void NDetA()
    {
        System.out.println("a:"+a);
    }
    public void NDetB()
    {
        System.out.println("b:"+b);
    }  public void NDetC()   
    {
        System.out.println("c:"+c);
    }
    public int aver()
    {
        int d=(a+b+c)/3;
        return d;
    }
    public int multi()
    {
        int d=a*b*c;
        return d;
    }
}
