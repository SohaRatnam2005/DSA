/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public void reorderList(ListNode head) {
          if (head == null || head.next == null) {
            return;
        }

        Stack<ListNode> stack = new Stack<>();
        ListNode slow = head;
        ListNode fast = head ;

        while(fast != null && fast.next != null){
            slow = slow.next ;
            fast=fast.next.next ;
        }

        ListNode curr = slow.next;
        slow.next = null ;
            while(curr != null){
                stack.push(curr);
                curr = curr.next ;
            }
            ListNode first = head ;
            while(!stack.isEmpty()){
                ListNode second = stack.pop();
                ListNode temp = first.next ;
                first.next = second ;
                second.next = temp ;
                first = temp ;
            }
       
    }
}
