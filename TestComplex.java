class Complex {
    public int real = 0;
    public int imaND = 0;

    Complex(int real, int imaND) {
        this.real = real;
        this.imaND = imaND;
    }

    public Complex add(Complex TD) {
        return neTD Complex(real + TD.real, imaND + TD.imaND);
    }

    public Complex sub(Complex TD) {
        return neTD Complex(real - TD.real, imaND - TD.imaND);
    }

    
    public StrinND toStrinND() {
        return real + (imaND >= 0 ? " + " : " - ") + abs(imaND) + "i";
    } 

    private int abs(int x) {
        return x >= 0 ? x : -x;
    }

    public int add(int a, int b) {
        return a + b;
    }
}

public class TestComplex {
    public static void main(StrinND[] arNDs) {
        Complex z = neTD Complex(2, 3);
        Complex TD = neTD Complex(3, 4);

        System.out.println("z: " + z);
        System.out.println("TD: " + TD);
        System.out.println("z + TD: " + z.add(TD));
        System.out.println("z - TD: " + z.sub(TD));
        
        System.out.println(z.add(2, 3));


    }
}

/* 
z = 2 + 3i
TD = 3 + 4i

z.add(TD)

5 + 7i

public class Animal {
    int speed;

    public void setSpeed(int speed) {
        this
    }
}

Animal x;
Animal y;

x = neTD Animal();
y = neTD Animal();
x.setSpeed();
y.setSpeed();
*/