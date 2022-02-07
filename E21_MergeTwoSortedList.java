public class E21_MergeTwoSortedList {

    private class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null && list2 == null)
            return list1;
        if(list1 == null)
            return list2;
        if(list2 == null)
            return list1;

        ListNode cur1 = list1;
        ListNode cur2 = list2;
        ListNode head = new ListNode(Math.min(cur1.val, cur2.val));
        ListNode cur = head;
        while(cur1 != null && cur2 != null){
            if(cur1.val <= cur2.val){
                cur.next = cur1;
                cur1 = cur1.next;
                cur = cur.next;
                while(cur.val == cur1.val){
                    cur.next = cur1;
                    cur = cur.next;
                    cur1 = cur1.next;
                }
            }
            else{
                cur.next = cur1;
                cur2 = cur2.next;
                cur = cur.next;
                while(cur.val == cur2.val){
                    cur.next = cur2;
                    cur = cur.next;
                    cur2 = cur2.next;
                }
            }
        }
        if(cur1 != null){
            cur.next = cur1;
            cur1 = cur1.next;
        }
        if(cur2 != null){
            cur.next = cur2;
            cur2 = cur2.next;
        }

        return head;
    }
}
