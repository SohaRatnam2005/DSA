class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;

        while (true) {

            // 1. Find the kth node
            ListNode kth = prev;

            for (int i = 0; i < k; i++) {
                kth = kth.next;

                // Fewer than k nodes remain
                if (kth == null) {
                    return dummy.next;
                }
            }

            // 2. Save the node after the group
            ListNode groupNext = kth.next;

            // 3. Reverse the group
            ListNode curr = prev.next;
            ListNode previous = groupNext;

            while (curr != groupNext) {

                ListNode next = curr.next;

                curr.next = previous;

                previous = curr;
                curr = next;
            }

            // 4. Connect previous part to reversed group
            ListNode oldStart = prev.next;
            prev.next = kth;

            // 5. Move prev to the end of reversed group
            prev = oldStart;
        }
    }
}