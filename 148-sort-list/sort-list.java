

class Solution {
    
    public ListNode sortList(ListNode head) {
    if (head == null) return null;
      ListNode curr = head;
      
      int n = 0 ;
      while(curr != null){
        n++;
        curr = curr.next ;
      }
      int[] arr = new int[n];
      curr = head ;
      for(int i = 0 ; i < n ; i++ ){
        arr[i]= curr.val ;
        curr = curr.next ;
      }

      Arrays.sort(arr);

      ListNode dummy = new ListNode(0);
      ListNode temp = dummy ;

      for(int val : arr ){
        temp.next = new ListNode(val);
        temp = temp.next;
      }
      return dummy.next ;
    }
}
