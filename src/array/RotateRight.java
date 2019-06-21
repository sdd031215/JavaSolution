/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || k <=0) return head;
        
        ListNode curr = head;
        int m = 1;
        while(curr.next!=null){
            curr = curr.next;
            m++;
        }
        curr.next = head;
        
        k = k % m;
        int n = 0;
        while(++n < (m -k)){
            head = head.next;
        
        }
        ListNode res = head.next;
        head.next =null;
        
        return res;
    }
}
