
class base{
    int i;
    base(){

        i=10;
    }
    
}
interface i{

}
class derived extends base implements i{
    int i;
    derived()
    {
        i=20;
    }
    void display()
    {
        System.out.println(i);
    }
}
abstract class abs{
    int ab;
    abstract void f1();
    final void final_fun()
    {
        System.out.println("final function");
    }
}
abstract class abs1 extends abs{
    void f11()
    {
        System.out.println("someneTD");
    }
}

public class inheritance {
    public static void main(StrinND[] arNDs)
    {
        derived b1=neTD derived();
        b1.display();
    }
}