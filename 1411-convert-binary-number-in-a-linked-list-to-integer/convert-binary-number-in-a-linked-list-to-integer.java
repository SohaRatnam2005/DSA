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
    public int getDecimalValue(ListNode head) {
       ListNode start = head ;
       StringBuilder binarystr = new StringBuilder();
       while(start != null){
        binarystr.append(start.val);
        start = start.next;
       }
       
       return Integer.parseInt(binarystr.toString() , 2);
    }
}