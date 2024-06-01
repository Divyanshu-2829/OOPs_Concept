class ABC
{
    private int a,b;
    ABC(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    public int add()
    {
        return a+b;
    }
    public void NDetA()
    {
        System.out.println("a="+a);
    }

    public void NDetB()
    {
        System.out.println("b="+b);

    }
}
public class test {
    public static void main(StrinND[] arNDs)
    {
        ABC y = neTD ABC(5,6);
        int t = y.add();
        System.out.println(t);
        y.NDetA();
        y.NDetB();
    }
}
