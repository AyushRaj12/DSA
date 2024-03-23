import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class Main {
    private ListNode front;
    private ListNode rear;
    private int length;
    private class ListNode{
        private ListNode next;
        private int data;
        public ListNode(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public int length()
    {
        return length;
    }
    public boolean isEmpty()
    {
        return length==0;
    }
    public void enqueue(int data)
    {
        ListNode newNode= new ListNode(data);
        if(isEmpty())
        {
            front=newNode;
        }
        else
        {
            rear.next=newNode;
        }
        rear=newNode;
        length++;
    }
    public void display()
    {
        if(isEmpty())
        {
            return;
        }
        ListNode current=front;
        while(current!=null){
            System.out.print(current.data+" ");
            current=current.next;
        }
    }
    public int dequeue()
    {
        if(isEmpty())
        {
            throw new NoSuchElementException();
        }
        int result=front.data;
        front=front.next;
        if(front==null)
        {
            rear=null;
        }
        length--;
        return result;
    }

  public static String[] generateBinary(int num)
  {
      Queue<String>q=new LinkedList<>();
      String[] result=new String[num];
      q.offer("1");
      for(int i=0;i<num;i++)
      {
          result[i]=q.poll();
          String n1=result[i]+"0";
          String n2=result[i]+"1";
          q.offer(n1);
          q.offer(n2);
      }
      return result;
  }
    public static void main(String[] args) {
        Main main=new Main();
        main.enqueue(1);
        main.enqueue(2);
        main.enqueue(3);
        main.enqueue(4);
        main.enqueue(5);
        System.out.println(main.length());
        main.display();
        System.out.println(main.dequeue());
        main.display();
        int n=5;
        String arr[]=generateBinary(n);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}