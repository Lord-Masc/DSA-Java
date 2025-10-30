public class Reverse1 {

    public ListNode reverseList(ListNode l1){
        ListNode prev = null;
        ListNode curr = l1;
        while(curr != null){
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList();
        ll.AddFirst(10);
        ll.AddFirst(20);
        ll.AddFirst(30);
        ll.AddFirst(40);
        ll.AddFirst(50);

        Reverse1 obj = new Reverse1();
        ListNode result = obj.reverseList(ll.head);
        result.printList();


    }
}
