
import java.util.HashSet;


public class DeleteNodes1 {

   
    public ListNode deleteNode(int nums[],ListNode head){
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode cur = head;

        HashSet<Integer> set = new HashSet<>();
        for (int num  : set) {
            set.add(num);
        }

        while (cur!=null) {
            if(set.contains(cur.val)){
                pre.next = cur.next;
            }else{
                pre = cur;
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
        ll.AddFirst(4);
        ll.AddFirst(4);
        ll.AddFirst(5);

        int arr[] = {2,3};
        DeleteNodes1 obj = new DeleteNodes1();
        ListNode result = obj.deleteNode(arr,ll.head);
        result.printList();

        ll.printList();
    }

}
