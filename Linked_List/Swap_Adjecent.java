public class Swap_Adjecent {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void AddFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public static void swapAdj() {
        Node dummy = new Swap_Adjecent().new Node(0); // dummy node
        dummy.next = head;
        Node pre = dummy;
        Node cur = head;

        while (cur != null && cur.next != null) {
            Node swap1 = cur;
            Node swap2 = cur.next;

            // swapping
            swap1.next = swap2.next;
            swap2.next = swap1;
            pre.next = swap2;

            // move pointers
            pre = swap1;
            cur = swap1.next;
        }

        head = dummy.next; // update head after swapping
        printList();
    }

    public static void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Swap_Adjecent ll = new Swap_Adjecent();
        ll.AddFirst(10);
        ll.AddFirst(20);
        ll.AddFirst(30);
        ll.AddFirst(40);
        ll.AddFirst(50);

        System.out.println("Original List:");
        printList();

        System.out.println("After Swapping:");
        ll.swapAdj();
    }
}
