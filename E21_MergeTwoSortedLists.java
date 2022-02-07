public class E21_MergeTwoSortedLists {
    private class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null)
            return list2;
        if(list2 == null)
            return list1;

        ListNode c1 = list1;
        ListNode c2 = list2;
        ListNode head = new ListNode();
        if(c1.val < c2.val){
            head = new ListNode(c1.val);
            c1 = c1.next;
        }
        else{
            head = new ListNode(c2.val);
            c2 = c2.next;
        }
        ListNode cur = head;
        while(c1 != null && c2 != null){
            if(c1.val <= c2.val){
                cur.next  = new ListNode(c1.val);
                c1 = c1.next;
            }
            else if(c1.val > c2.val){
                cur.next = new ListNode(c2.val);
                c2 = c2.next;
            }
            cur = cur.next;
        }

        while(c1 != null){
            cur.next = new ListNode(c1.val);
            cur = cur.next;
            c1 = c1.next;
        }
        while(c2 != null){
            cur.next = new ListNode(c2.val);
            cur = cur.next;
            c2 = c2.next;
        }

        return head;
    }
}
