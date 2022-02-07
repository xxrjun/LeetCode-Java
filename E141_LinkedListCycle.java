import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class E141_LinkedListCycle {
    private class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null || head.next.next == null)
            return false;

        HashSet<ListNode> set = new HashSet<>();
        ListNode cur = head;
        while(cur.next != null){
            if(set.contains(cur))
                return true;
            cur = cur.next;
        }
        return false;
    }

//    public static boolean hasCycle(ListNode head) {
//        if(head == null || head.next == null || head.next.next == null)
//            return false;
//        ListNode slow = head, fast = head;
//        while(fast != null && fast.next != null){
//            slow = slow.next;
//            fast = fast.next.next;
//            if(slow == fast)
//                return true;
//        }
//        return false;
//    }

}
