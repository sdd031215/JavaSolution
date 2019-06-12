/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        
        if(head == null) return null;
        ListNode slow = head;
        ListNode fast = head.next;
        while(slow != fast){
            if(fast == null || fast.next == null){
                return null;
            }
            
            slow = slow.next;
            fast = fast.next.next;
        }
        
        slow = slow.next;
        ListNode slow2 = head;
        while(slow != slow2){
            
            slow = slow.next;
            slow2 = slow2.next;
        }
        
        return slow;
    }
}
