/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null ) return null;

        Node curr = head ;
        while(curr != null){
            Node newNode = new Node(curr.val);
            newNode.next = curr.next ;
            curr.next = newNode ;//like copy value but change pointers
            curr = newNode.next ;// made a list like 2>2>4>4>6>6>8>8
        }
        curr = head ;// now we start copying random pointers 
        while(curr != null){
            if(curr.random != null){
                curr.next.random = curr.random.next ;
            }
            curr = curr.next.next ;
        }
        //seperating the lists 
        curr = head ;
        Node newHead = head.next ;
        Node newCurr = newHead ;
        while(curr != null){
            curr.next = newCurr.next ;
            curr = curr.next ;
            if(curr != null){
                newCurr.next = curr.next ;
                newCurr = newCurr.next ;
            }
        }
        return newHead ;

    }
}
