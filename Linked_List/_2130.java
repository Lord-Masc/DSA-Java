
public class _2130 {

    int maxSum(ListNode head) {
        //step 1 :- find the middle of LL
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode l2 = slow.next;
        slow.next = null;
        ListNode l1 = head;

        // Step 2:- Revese the second list
        int max = 0;
        l2 = reverseList(l2);
        while (l1 != null && l2 != null) {
            int sum = l1.val + l2.val;
            int maxs = Math.max(max, sum);
            max = maxs;
            l1 = l1.next;
            l2 = l2.next;
        }
        return max;
    }

    public ListNode reverseList(ListNode l1) {
        ListNode prev = null;
        ListNode curr = l1;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.AddLast(5);
        list.AddLast(4);
        list.AddLast(2);
        list.AddLast(1);

        _2130 obj = new _2130();
        int result = obj.maxSum(list.head);
        System.out.println(result);

    }
}
