
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if( head == null || head.next == null ) return null ;
       ListNode first = head ;
       ListNode second = head ;
       int n = 0 ;
       int count = 0 ; 
       while( first != null ){
        n += 1 ;
        first = first.next ;
       }
       
       while ( count != (n/2 )-1  ){
        count ++ ;
        second = second.next ;
       }
       second.next = second.next.next ;

       return head;
    }
}