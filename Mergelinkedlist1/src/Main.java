public class Main {
    public ListNode head;
    public static class ListNode{
        public int data;
        public ListNode next;

        public ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }

    public void display()
    {
        ListNode current =head;
        while(current!=null)
        {
            System.out.print(current.data+" ");
            current=current.next;
        }
        System.out.println();
    }

    public ListNode mergeLinkedList(ListNode a,ListNode b)
    {
        ListNode dummy=new ListNode(0);
        ListNode tail=dummy;
        while(a!=null && b!=null)
        {
           if(a.data<=b.data)
           {
               tail.next=a;
               a=a.next;
           }
           else
           {
               tail.next=b;
               b=b.next;
           }
           tail=tail.next;
        }
        if(a==null)
        {
            tail.next=b;
        }
        else
        {
            tail.next=a;
        }
        return dummy.next;
    }
    public ListNode addLinkedList(ListNode a,ListNode b)
    {
        ListNode dummy=new ListNode(0);
        ListNode tail=dummy;
        int carry=0;
        while(a!=null && b!=null)
        {
            int x=(a!=null)?a.data:0;
            int y=(b!=null)?b.data:0;
            int sum=x+y+carry;
            carry=sum/10;
            tail.next=new ListNode(sum%10);
            tail=tail.next;
            if(a!=null)a=a.next;
            if(b!=null)b=b.next;
        }
        if(carry>0)
        {
            tail.next=new ListNode(carry);
        }
        return dummy.next;
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

        Main main1=new Main();
        ListNode a=new ListNode(3);
        ListNode b=new ListNode(7);
        ListNode c=new ListNode(9);
        ListNode d=new ListNode(10);
        ListNode e=new ListNode(11
        );
        main1.head=a;
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;

        main.display();
        main1.display();

        Main main2=new Main();
        main2.head=main2.mergeLinkedList(main.head,main1.head);
        //main2.head=main2.addLinkedList(main.head,main1.head);
        main2.display();

    }
}