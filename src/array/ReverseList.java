/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        
        ListNode pre = null, curr = head , next = null;
        while(curr != null){
            
            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        
        return pre;
    }
}
