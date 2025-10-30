public class reorder_List {

    public ListNode middleNode (ListNode head){


        ListNode slow = head;
        ListNode fast = head;

        while (fast.next!=null&&fast.next.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = null;
        return head;
    }
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.AddLast(1);
        list.AddLast(2);
        list.AddLast(3);
        list.AddLast(4);
        list.AddLast(5);
        list.AddLast(6);
        
        reorder_List l = new reorder_List();
        ListNode result = l.middleNode(list.head);

        result.printList();
    }
}
