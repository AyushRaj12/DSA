public class Main {

    private ListNode head;
    private ListNode tail;
    private int length;

    private static class ListNode{
        private int data;
        private ListNode next;
        private ListNode previous;
        public ListNode(int data)
        {
            this.data=data;
        }
    }
    public Main()
    {
        this.head=null;
        this.tail=null;
        this.length=0;
    }
    public boolean isEmpty()
    {
        return length==0;//head==null
    }
    public int length()
    {
        return length;
    }

    public void printForward()
    {
        if(head==null)
        {
            return;
        }
        ListNode temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data);
            temp=temp.next;
        }
        System.out.println();
    }
    public void printBackward()
    {
        if(tail==null)
        {
            return;
        }
        ListNode temp=tail;
        while(temp!=null)
        {
            System.out.print(temp.data);
            temp=temp.previous;
        }
        System.out.println();
    }
    public void insertBeginning(int data) {
        ListNode newNode = new ListNode(data);
        head.previous = newNode;
        newNode.next = head;
        head = newNode;
    }
    public void insertAtEnd(int data)
    {
        ListNode newNode=new ListNode(data);
        tail.next=newNode;
        newNode.previous=tail;
        tail=newNode;

    }
    public void deleteFirst()
    {
        if(head!=null)
        {
            ListNode current=head;
            head=head.next;
            current.next=null;
        }

    }
    public void  deleteLast()
    {
        ListNode current=tail;
        tail=tail.previous;
        tail.next=null;
        current.previous=null;
    }
    public static void main(String[] args) {

        Main main=new Main();
        ListNode first=new ListNode(1);
        ListNode second =new ListNode(2);
        ListNode third=new ListNode(3);
        ListNode fourth=new ListNode(4);
        ListNode fifth =new ListNode(5);

        main.head=first;
        first.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;

        main.tail=fifth;
        fifth.previous=fourth;
        fourth.previous=third;
        third.previous=second;
        second.previous=first;


        main.printForward();
        main.printBackward();
        main.insertBeginning(2);
        main.printForward();
        main.insertAtEnd(7);
        main.printForward();
        main.deleteFirst();
        main.printForward();
        main.deleteLast();
        main.printForward();

    }
} 