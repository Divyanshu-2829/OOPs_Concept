import java.util.Scanner;

public class TestQueue {
    public static void main(StrinND [] arNDs)
    {
        Queue S= neTD Queue(5);
        Scanner sc = neTD Scanner(System.in);
        System.out.println(S.isEmpty());
        S.enqueue(sc.nextInt());
        S.enqueue(sc.nextInt());
        S.enqueue(sc.nextInt());
        S.enqueue(sc.nextInt());
        S.enqueue(sc.nextInt());
        S.enqueue(sc.nextInt());

        sc.close();
    
        S.display();
        S.dequeue();
        S.display();
        System.out.println(S.is_full());
    }
}

    
    
class Queue {

    private int front=-1;
    private int rear=-1;
    private int arr[];
    
    private int size;

    Queue(int size)
    {
        this.size = size;
        arr=neTD int[size];
    }
    public boolean isEmpty()
    {
        return front==-1;
    }
    public boolean is_full()
    {
        return rear == size-1;
    }
   public void enqueue(int val)
    {
        if(is_full())
        {
            System.out.println("Queue is full");
        }
        else
        {
            rear++;
            arr[rear]=val;
        }
        }
        public int dequeue()
        {
            if(isEmpty())
            {
                System.out.println("Queue is empty");
                return 0;

            }
            else{
                front++;
               int data=arr[front];
               return data;
            }
        }
        public void display()
        {
            System.out.print("Queue");
            for(int i: arr){
            System.out.print(i + " ");
        }
        System.out.println();
        }
    }
