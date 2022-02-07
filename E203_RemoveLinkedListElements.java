public class E203_RemoveLinkedListElements {
    public static void main(String[] args) {
        ListNode n1 = new ListNode(5, new ListNode(4, new ListNode(3, new ListNode(2, new ListNode(1, new ListNode(1))))));
//        ListNode n1 = new ListNode(1, new ListNode(2));
        n1 = removeElements(n1, 1);
        while(n1 != null){
            System.out.print(n1.val + " ");
            n1 = n1.next;
        }
        System.out.println();
    }
    private static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode removeElements(ListNode head, int val) {
        if(head == null)
            return null;

        ListNode prev, cur = head;
        while(cur.val == val){
            if(cur.next == null){
                return null;
            }
            cur = cur.next;
        }
        prev = cur;
        head = prev;
        while(cur != null){
            if(cur.val == val){
                if(cur.next == null) {
                    prev.next = null;
                    return head;
                }
                else{
                    cur = cur.next;
                }

                while(cur.val == val){
                    cur = cur.next;
                    if(cur == null){
                        prev.next = null;
                        return head;
                    }
                }
                prev.next = cur;
            }
            prev = cur;
            cur = cur.next;
        }

        return head;
    }
}
