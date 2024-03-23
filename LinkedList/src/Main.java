public class Main {
    public static void main(String[] args) {
        SinglyLinkedList obj=new SinglyLinkedList();
        obj.head=new SinglyLinkedList.ListNode(10);
        SinglyLinkedList.ListNode second =new SinglyLinkedList.ListNode(20);
        SinglyLinkedList.ListNode third=new SinglyLinkedList.ListNode(30);
        SinglyLinkedList.ListNode fourth=new SinglyLinkedList.ListNode(40);
        SinglyLinkedList.ListNode fifth =new SinglyLinkedList.ListNode(50);
        SinglyLinkedList.ListNode sixth =new SinglyLinkedList.ListNode(50);
        obj.head.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        fifth.next=sixth;
        sixth.next=third;
        /*obj.display();
        obj.insertInBeginning(10);
        obj.display();
        obj.insertAtEnd(50);
        obj.display();
        obj.insertAtPosition(25,3);
        obj.display();
        //obj.deleteFirst();
        obj.display();
        //obj.deleteLast();
        obj.display();
        //obj.deleteAtPosition(3);
        obj.display();
        //System.out.print(obj.SearchElement(30));
        //obj.reverseList();
        obj.display();
        obj.middleNode();
        obj.middleNode1();
        obj.nthFromEnd(4);
        obj.removeDuplicate();
        obj.display();
        obj.insertAtSorted(35);
        obj.display();
        obj.removeKey(35);
        obj.display();*/
        System.out.println(obj.detectLoop().data);
        obj.detectLoop1();
        obj.display();
    }
}
