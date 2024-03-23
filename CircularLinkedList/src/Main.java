public class Main {
    private ListNode last;
    private int length;
    private class ListNode{
        private int data;
        private ListNode next;
        public ListNode(int data)
        {
            this.data=data;
        }
    }
    public Main()
    {
        last=null;
        length=0;
    }
    public int length()
    {
        return length;
    }
    public Boolean isEmpty(){
        return length==0;
    }
    public void createCircularLinkedList(){
        ListNode first=new ListNode(1);
        ListNode second =new ListNode(2);
        ListNode third=new ListNode(3);
        ListNode fourth=new ListNode(4);
        ListNode fifth =new ListNode(5);

        first.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        fifth.next=first;

        last=fifth;
    }
    public void printElement()
    {
        if(last==null){
            return;
        }
        ListNode first=last.next;
        while(first!=last)
        {
            System.out.print(first.data);
            first=first.next;
        }
        System.out.print(first.data);
        System.out.println();
    }
    public void insertAtBeg(int data)
    {
        ListNode newNode=new ListNode(data);
        if(last==null)
        {
            last=newNode;
        }
        else{
        newNode.next=last.next;
        last.next=newNode;
        }
        length++;
    }
    public void  insertAtEnd(int data)
    {
        ListNode newNode=new ListNode(data);
        if(last==null)
        {
            last=newNode;
            last.next=last;
        }
        else
        {
            newNode.next=last.next;
            last.next=newNode;
            last=newNode;
        }
        length++;
    }
    public ListNode removeFirst()
    {
        ListNode temp=last.next;
        last.next=temp.next;
        temp.next=null;
        return temp;
    }
    public static void main(String[] args) {
        Main main=new Main();
       // main.createCircularLinkedList();
        main.insertAtEnd(1);
        main.insertAtEnd(2);
        main.insertAtEnd(3);
        main.insertAtEnd(4);
        main.insertAtEnd(5);

        main.printElement();
        main.insertAtBeg(0);
        main.printElement();
        main.insertAtEnd(6);
        main.printElement();
        main.removeFirst();
        main.printElement();
    }
}