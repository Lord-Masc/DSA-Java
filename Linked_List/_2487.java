
public class _2487 {

    public ListNode deleteNode(ListNode head) {
        head = reverse(head);
        ListNode curr = head;
        int max = curr.val;
        while (curr != null && curr.next != null) {
            if (curr.next.val < max) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
                max = curr.val;
            }

        }
        return reverse(head);

    }

    public ListNode reverse(ListNode head) {
        ListNode curr = head, pre = null;
        while (curr != null) {
            ListNode nextNode = curr.next;
            curr.next = pre;
            pre = curr;
            curr = nextNode;
        }
        return pre;
    }

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.AddLast(5);
        list.AddLast(2);
        list.AddLast(13);
        list.AddLast(3);
        list.AddLast(8);

        _2487 obj = new _2487();
        ListNode re = obj.deleteNode(list.head);
        re.printList();

    }
}
