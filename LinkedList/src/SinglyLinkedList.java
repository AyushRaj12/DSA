import java.util.List;

public class SinglyLinkedList {
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
        int count=0;
        while(current!=null)
        {
            System.out.print(current.data+" ");
            current=current.next;
            count++;
        }
        System.out.println(count);
    }
    public void insertInBeginning(int data)
    {
        ListNode newNode=new ListNode(data);
        newNode.next=head;
        head=newNode;
    }
    public void insertAtEnd(int data)
    {
        ListNode newNode=new ListNode(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        ListNode current;
        current=head;
        while(current.next!=null)
        {
            current=current.next;
        }
        current.next=newNode;
        newNode.next=null;
    }
    public void insertAtPosition(int data,int n)
    {
        ListNode newNode=new ListNode(data);
        ListNode current=head;
        ListNode p=head.next;
        for(int i=0;i<n-1;i++)
        {
            current=current.next;
            p=p.next;
        }
        current.next=newNode;
        newNode.next=p;
    }
    public ListNode deleteFirst()
    {
        if(head==null)
        {
            return null;
        }
        ListNode current=head;
        head=head.next;
        current.next=null;
        return current;
    }
    public ListNode deleteLast()
    {
        if(head==null)
        {
            return null;
        }
        ListNode current=head.next;
        ListNode p=head;
        while(current.next!=null)
        {
            current=current.next;
            p=p.next;
        }
        p.next=null;
        return current;
    }
    public ListNode deleteAtPosition(int n)
    {
        if(head==null)
        {
            return null;
        }
        int i=1;
        ListNode current=head;
        ListNode p=head.next;
        while(i<n-1)
        {
           current=current.next;
           p=p.next;
           i++;
        }
        current.next=p.next;
        p.next=null;
        return p;
    }
    public boolean SearchElement(int num)
    {
        ListNode current=head;
        while(current.next!=null)
        {
            if(current.data==num)
            {
                return true;
            }
            current=current.next;
        }
        return false;
    }
    public void reverseList()
    {
        ListNode current=head;
        ListNode previous=null;
        ListNode next;
        while(current!=null)
        {
            next=current.next;
            current.next=previous;
            previous=current;
            current=next;
        }
        head=previous;
    }
    public void middleNode()
    {
        ListNode current=head;
        int count=0;
        int middle;
        while(current.next!=null)
        {
            current=current.next;
            count++;
        }
        if(count%2==0)
        {
            middle=count/2;
        }
        else{
            middle=(count/2)+1;
        }
        ListNode p=head;
      for(int i=0;i<middle;i++)
      {
          p=p.next;
      }
      System.out.println(p.data);
    }
    public void middleNode1()
    {
        ListNode fstPtr=head;
        ListNode slowPtr=head;
        while(fstPtr!=null && fstPtr.next!=null)
        {
            slowPtr=slowPtr.next;
            fstPtr=fstPtr.next.next;
        }
        System.out.println(slowPtr.data);
    }
    public void nthFromEnd(int n)
    {
        ListNode refPtr=head;
        ListNode mainPtr=head;
        int count=0;
        while(count<n-1){
            refPtr=refPtr.next;
            count++;
        }
        while(refPtr.next!=null)
        {
            mainPtr=mainPtr.next;
            refPtr=refPtr.next;
        }
        System.out.println(mainPtr.data);
    }
    public void removeDuplicate()
    {
        ListNode current=head;
        while(current.next!=null && current!=null)
        {
            if(current.data==current.next.data)
            {
                current.next=current.next.next;
            }
            else
            {
                current=current.next;
            }
        }
    }
    public void insertAtSorted(int value)
    {
        ListNode newNode= new ListNode(value);
        ListNode current=head;
        ListNode p=head.next;
        while(p!=null)
        {
            if(current.data<value && current.next.data>=value)
            {
                current.next=newNode;
                newNode.next=p;
            }
            current=current.next;
            p=p.next;
        }
    }
    public void removeKey(int key)
    {
        ListNode current=head;
        ListNode temp=null;
        while(current!=null)
        {
            if(current.data==key)
            {
                temp.next=current.next;
            }
            temp=current;
            current=current.next;
        }
    }
    public ListNode detectLoop()
    {
        ListNode slwPtr=head;
        ListNode fstPtr=head;
        while(fstPtr!=null && fstPtr.next!=null)
        {
            slwPtr=slwPtr.next;
            fstPtr=fstPtr.next.next;
            if(slwPtr==fstPtr)
            {
                return getStartElement(slwPtr);

            }
        }
        return null;
    }
    public ListNode getStartElement(ListNode slwPtr)
    {
        ListNode temp=head;
        while(slwPtr!=temp)
        {
            slwPtr=slwPtr.next;
            temp=temp.next;
        }
        return temp;
    }
    public void detectLoop1()
    {
        ListNode slwPtr=head;
        ListNode fstPtr=head;
        while(fstPtr!=null && fstPtr.next!=null)
        {
            slwPtr=slwPtr.next;
            fstPtr=fstPtr.next.next;
            if(slwPtr==fstPtr)
            {
               removeLoop(slwPtr);

            }
        }
    }
    public void removeLoop(ListNode slwPtr)
    {
        ListNode temp=head;
        while(slwPtr.next!=temp.next)
        {
            slwPtr=slwPtr.next;
            temp=temp.next;
        }
        slwPtr.next=null;
    }

}
