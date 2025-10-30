public class _2807 {

    public ListNode greatestCommamDiviser(ListNode head){
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode currNode = head;
        ListNode nextNode = currNode.next;

        while (currNode!=null&&currNode.next!=null) {
            int a = currNode.val;
            int b = nextNode.val;

            int nodeVal = gcd(a,b);
            ListNode newNode  = new ListNode(nodeVal);

            newNode.next=currNode.next;
            currNode.next=newNode;

            currNode=nextNode;
            nextNode=nextNode.next;


        }
        return head;
        
    }
    private int gcd(int a,int b){
        int hcf=0;
        for (int i = 1; i <= a&&i<=b; i++) {
            if (a%i==0&&b%i==0) {
                hcf = i;
            }
        }
        return hcf;

    }
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.AddLast(18);
        list.AddLast(6);
        list.AddLast(10);
        list.AddLast(3);

        list.printList();

        _2807 l = new _2807();
        ListNode re = l.greatestCommamDiviser(list.head);
        re.printList();


    }
}
