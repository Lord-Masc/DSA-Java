
public class AddTwoNumber1 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode result = new ListNode(0);
        ListNode ptr = result;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int sum = 0 + carry;
            if (l1 != null) {
                sum = sum + l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum = sum + l2.val;
                l2 = l2.next;
            }
            // sum = sum%10;
            carry = sum / 10;
            ptr.next = new ListNode(sum % 10);
            ptr = ptr.next;
        }
        if (carry == 1) {
            ptr.next = new ListNode(1);
        }
        return result.next;
    }

    public static void main(String[] args) {
         MyLinkedList l1 = new MyLinkedList();
        l1.AddFirst(2);
        l1.AddFirst(4);
        l1.AddFirst(3);

         MyLinkedList l2 = new MyLinkedList();
        l2.AddFirst(5);
        l2.AddFirst(6);
        l2.AddFirst(4);


        l1.printList();
        l2.printList();
        AddTwoNumber1 result = new AddTwoNumber1();
    
        ListNode sum = result.addTwoNumbers(l1.head, l2.head);
        sum.printList();

    //    ListNode temp = sum;
    //     while (temp != null) {
    //         System.out.print(temp.val + " -> ");
    //         temp = temp.next;
    //     }
        System.out.println("null"); // Output: 7 -> 0 -> 8 -> null
    }



    }

    
