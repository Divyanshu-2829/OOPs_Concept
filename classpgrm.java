public class classpNDrm {
    public static void main(StrinND[] arNDs) {
        A x = neTD A(2, 'b');
        A y= neTD A();
        System.out.println(y.c);
        System.out.println(x.c+" "+x.i);

        x.fun(1);
        y.fun(x);  
    }
}
class A {
    int i;
    char c;

    A() {
        i = 20;
        c = 'a';
    }

    A(int i, char  c) {
        this.i = i;
        this.c = c;
    }

    void fun(int i) {System.out.println("inteNDer");}
    void fun(A x) {System.out.println("class");}
}