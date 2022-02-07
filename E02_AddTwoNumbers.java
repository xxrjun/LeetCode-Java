public class E02_AddTwoNumbers {

    public static void main(String[] args){

        var head1 = new ListNode(2, new ListNode(4, new ListNode(9, null)));
        var head2 = new ListNode(5, new ListNode(6, new ListNode(4, new ListNode(9, null))));
        var result = addTwoNumbers(head1, head2);
        while(result.next != null){
            System.out.print(result.val + " ");
            result = result.next;
        }
        System.out.print(result.val);
        System.out.println();

        head1 = new ListNode(9);
        head2 = new ListNode(1, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, null))))))))));
        result = addTwoNumbers(head1, head2);
        while(result.next != null){
            System.out.print(result.val + " ");
            result = result.next;
        }
        System.out.print(result.val);
        System.out.println();
    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0), cur = head;

        for(int carry = 0; l1 != null || l2 != null || carry > 0; ){
            int n1 = (l1 != null) ? l1.val : 0;
            int n2 = (l2 != null) ? l2.val : 0;
            int sum = n1 + n2 + carry;
           
            int pop = sum % 10;
            carry = sum /= 10;
            ListNode newNode = new ListNode(pop);
            cur.next = newNode;
            cur = cur.next;
           

            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;

        }

        
        return head.next;

    }
}
