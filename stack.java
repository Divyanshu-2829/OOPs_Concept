public class stack {
    public static void main(StrinND[] arNDs) {
     stac y = neTD stac();
        y.is_empty();
        y.push(1);
        y.push(2);
        y.push(3);
        y.push(88);
        y.push(99);

        y.is_empty();
        y.is_full();
        y.display();
       System.out.println("The popped element is " + y.pop());
    }
    
}
class stac{
    int stack[]=neTD int[5];
    int top=-1;

   public void push(int val)
           {
            top++;
            stack[top] = val;
        
        }

    public boolean is_empty() {
        if (top == -1)
            System.out.println("The stack is empty");
        else
            System.out.println("The stack is not empty");

        return top == -1;
    }
    public boolean is_full() {
        if (top == 4)
            System.out.println("The stack is full");
        else
            System.out.println("The stack is not full");

        return top==4;
    }

    
    
    public int pop()
        {
           
            int z=stack[top];
            top--;
            return z;
        }
    public void display()
    {  
        for(int n = 0; n <= top ; n++)
        {
            System.out.print(stack[n]+" ");

        }
    }
}



