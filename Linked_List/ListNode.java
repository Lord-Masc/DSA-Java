class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }

    public void printList() {
        ListNode temp = this;  // start from current node
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

// Linked list helper class
class MyLinkedList {
    ListNode head;

    // Insert at beginning
    public void AddFirst(int data) {
        ListNode newNode = new ListNode(data);
        newNode.next = head;
        head = newNode;
    }

    public void AddLast(int data){
        ListNode newNode = new ListNode(data);

        ListNode temp = head;
        if (head==null) {
            head=newNode;
            return;
        }
        while (temp.next!=null) {
            temp=temp.next;
        }
        temp.next=newNode;

    }

    // Print list
    public void printList() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}