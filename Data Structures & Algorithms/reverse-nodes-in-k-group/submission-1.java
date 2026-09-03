class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;

        while (true) {
            ListNode kth = prev;

            for (int i = 0; i < k; i++) {
                kth = kth.next;
                if (kth == null) {
                    return dummy.next;
                }
            }
            ListNode groupNext = kth.next;

            ListNode curr = prev.next;
            ListNode previous = groupNext;
            while (curr != groupNext) {

                ListNode next = curr.next;

                curr.next = previous;

                previous = curr;
                curr = next;
            }

            ListNode oldStart = prev.next;
            prev.next = kth;

            prev = oldStart;
        }
    }
}