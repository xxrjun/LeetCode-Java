public class E83_RemoveDuplicatesFromSortedList {
    private static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode deleteDuplicates(ListNode head) {
        if(head == null)
            return null;

        ListNode cur = head;
        ListNode next = cur.next;
        while(cur.next != null){
            while(cur.val == next.val){
                next = next.next;
                if(next == null){
                    cur.next = null;
                    return head;
                }
            }
            cur.next = next;
            cur = cur.next;
            next = cur.next;
        }

        return head;
    }
}
