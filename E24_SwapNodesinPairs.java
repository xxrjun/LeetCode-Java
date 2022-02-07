public class E24_SwapNodesinPairs {
    public static void main(String[] args) {
//        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3)));
        ListNode cur = head;
        while(cur != null){
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
        System.out.println();

        cur = swapPairs(head);
        while(cur != null){
            System.out.print(cur.val + " ");
            cur = cur.next;
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

    public static ListNode swapPairs(ListNode head) {
        ListNode cur = head;
        if(cur == null || cur.next == null)
            return head;
        if(cur.next.next == null){
            ListNode tmpNode = cur.next;
            tmpNode.next = cur;
            cur.next = null;
            head = tmpNode;
            return head;
        }

        ListNode tmp;
        head = cur.next;
        ListNode secondtmp;
        while(cur.next.next != null){
            tmp = cur.next;
            secondtmp = tmp.next;
            tmp.next = cur;

            if(secondtmp.next != null){
                cur.next = secondtmp.next;
                cur = secondtmp;
            }
            else{
                cur.next = secondtmp;
                cur = secondtmp;
                break;
            }

        }
        if(cur.next != null){
            tmp = cur.next;
            tmp.next = cur;
            cur.next = null;
        }

        return head;

    }
}
