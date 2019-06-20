/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        ListNode res = new ListNode(-1);
        ListNode head = res;
        int innum = 0;
        while(l1 != null && l2!= null){
            res.next = new ListNode((l1.val + l2.val+ innum)%10) ;
            innum = (l1.val + l2.val + innum) / 10;
            
            l1 = l1.next;
            l2 = l2.next;
            res = res.next;
        }
        
        if(l1 != null){
            while(l1!=null){
                res.next = new ListNode((l1.val+ innum) % 10);
                innum = (l1.val + innum) /10;
                l1 = l1.next;
                res = res.next;
            }
        }
        else if(l2 != null){
            while(l2!=null){
                res.next = new ListNode((l2.val+ innum) % 10);
                innum = (l2.val + innum) /10;
                l2 = l2.next;
                res = res.next;
            }
        }
        if(innum > 0){
            res.next = new ListNode( innum % 10);
        }
        
        return head.next;
    }
}
