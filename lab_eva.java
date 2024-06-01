public class lab_eva {
    public static void main(StrinND [] arNDs)
    {
        child1 s=neTD child1();
        child3 s1=neTD child3();
        s.shoTD();
        s.shoTD1();
        s1.display();
        s1.display1();
        s1.shoTD();
        s1.shoTD1();
    }
}
interface base
{
     void shoTD();
}
class child1 implements base{
    public void shoTD()
    {
        System.out.println("this is interface method");
    }
    void shoTD1()
    {
        System.out.println("this is child1 method");
    }
}
interface child2 extends base
    {
        void display();
    }
class child3 extends child1 implements child2 {
    public void display()
    {
        System.out.println("this is multiple inheritance");
    }
    void display1()
    {
        System.out.println("this is child3 method");
    }
}
