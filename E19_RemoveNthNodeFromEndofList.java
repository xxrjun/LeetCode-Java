public class E19_RemoveNthNodeFromEndofList {

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode cur = head;
        int listlen = 0;
        while(cur != null){
            listlen++;
            cur = cur.next;
        }

        cur = head;
        if(n == listlen){
            head = head.next;
            return head;
        }
        else if (n < listlen) {
            for (int i = 1; i < listlen - n; i++) {
                cur = cur.next;
            }
            cur.next = cur.next.next;
            return head;
        }

        return head;
    }
}
