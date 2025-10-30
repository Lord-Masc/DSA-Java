



public class Double_Number {

    public static ListNode doubleIt(ListNode head) {

        ListNode prev =null;

        // Reverse the linked list
        prev = reverseList(head);

       
        int carry= 0;
        ListNode pre = prev;
        while (pre!=null) {
            int sum = pre.val*2 + carry;
            carry = sum/10;
            pre.val = sum%10;
            pre = pre.next;
            
        }

        if(carry==1){
            ListNode newNode = new ListNode(1);
            // prev = reverseList(prev);
            // newNode.next = prev;
            // return newNode;
            prev.next = newNode;
        }
        prev = reverseList(prev);
        return prev;




    }

    static ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }
    public static void main(String[] args) {
        MyLinkedList llListNode = new MyLinkedList();
        llListNode.AddFirst(1);
        llListNode.AddFirst(2);
        llListNode.AddFirst(3);
        llListNode.AddFirst(4);
        llListNode.printList();
        ListNode result = doubleIt(llListNode.head);
        result.printList();



    }
}
