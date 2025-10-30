public class ReveseLinkedList2 {

    public ListNode reverseList(ListNode head , int left , int right){
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode preNode = null;

        
        return dummy.next;

    }
    public static void main(String[] args) {
        MyLinkedList li = new MyLinkedList();
        li.AddFirst(1);
        li.AddFirst(2);
        li.AddFirst(3);
        li.AddFirst(4);
        li.AddFirst(5);
        li.AddFirst(6);

        ReveseLinkedList2 obj = new ReveseLinkedList2();
        li.printList();
        
    }
}
