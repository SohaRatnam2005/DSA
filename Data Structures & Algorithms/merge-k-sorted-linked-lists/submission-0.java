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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0 ){
            return null ;
        }
        return merger(lists,0,lists.length - 1);
    }
    private ListNode merger(ListNode[] lists , int start , int end){
        if(start == end){
            return lists[start];
        }
        if(start + 1 == end ){
            return mergehelp(lists[start],lists[end]);
        }
        int mid = start + (end - start)/2;
        ListNode left = merger(lists,start,mid);
        ListNode right = merger(lists ,mid +1 , end);
        return mergehelp(left , right);
    }


    private ListNode mergehelp(ListNode listA, ListNode listB){
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy ;

        while(listA != null && listB != null ){
            if(listA.val > listB.val){
                curr.next = listB ;
                listB = listB.next ;
            }
            else{
                curr.next = listA;
                listA = listA.next ;
            }
            curr = curr.next ;
        }
        curr.next = (listA != null) ? listA : listB;

        return dummy.next ;
    }
}
