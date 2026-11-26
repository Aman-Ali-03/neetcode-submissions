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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int counter = 0;
        while(temp != null)
        {
            counter += 1;
            temp = temp.next;
        }
        counter -= n;
        if(counter == 0)
        {
            return head.next;
        }
        temp = head;
        for(int i=0; i<counter-1; i++)
        {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
}
