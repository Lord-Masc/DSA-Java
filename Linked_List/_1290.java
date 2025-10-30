public class _1290 {

    public void getDecimal(ListNode head){
        ListNode curr = head;
        int sum = 0;
        int count=0;
        while (curr!=null) {
            sum = sum*2+curr.val;
            curr = curr.next;
        }
       System.out.println(sum);
    }
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.AddLast(1);
        list.AddLast(0);
        list.AddLast(1);

        _1290 re = new _1290();
        re.getDecimal(list.head);

        

    }
}
