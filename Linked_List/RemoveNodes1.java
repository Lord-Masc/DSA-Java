public class RemoveNodes1 {

    static ListNode removeList(ListNode head){
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = head;
        ListNode pre  = dummy;
        int max = Integer.MIN_VALUE;
        while(cur != null){
            if(cur.val >= max){
                max = cur.val;
                pre = cur;
            }else{
                pre.next = cur.next;
            }
            cur = cur.next;
        }
        return dummy.next;

    }
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList();
        ll.AddFirst(1);
        ll.AddFirst(1);
        ll.AddFirst(2);
        ll.AddFirst(3);
    }
}
