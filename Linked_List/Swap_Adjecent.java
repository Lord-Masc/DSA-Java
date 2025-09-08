
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

    public static void swapAdj(){
        Node n1 = new Node(0);
        n1.next = head;
        Node pre = n1;
        Node cur = head;

        while(cur!=null&&cur.next!=null){
            Node swap1 = head;
            Node swap2 = head.next;
        
            swap1.next = swap2.next;
            swap2.next = swap1;
            pre.next = swap2;
            pre = swap1;
            cur = swap1.next;
        }
        printList();
    }

    public static void printList(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        Swap_Adjecent ll = new Swap_Adjecent();
        ll.AddFirst(10);
        ll.AddFirst(20);
        ll.AddFirst(30);
        ll.AddFirst(40);
        ll.AddFirst(50);
        printList();
        ll.swapAdj();
    }
}
