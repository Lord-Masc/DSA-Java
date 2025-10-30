public class _237 {

    public ListNode removeNode(ListNode head){
         ListNode dummy = new ListNode(0);
         dummy.next = head;
         ListNode currNode = head;

         int value = 8;
         while (currNode !=null&&currNode.next!=null) {
            if (currNode.next.val==value) {
                currNode.next = currNode.next.next;
            }
            currNode=currNode.next;
         }
         return dummy.next;
    }
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.AddLast(5);
        list.AddLast(4);
        list.AddLast(8);
        list.AddLast(2);

        list.printList();
        _237 l = new _237();
        ListNode result = l.removeNode(list.head);
        result.printList();
    }
}
