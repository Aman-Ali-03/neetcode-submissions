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
    public ListNode reverseList(ListNode head) {
        ListNode temp = head;
        ListNode temp_head  =null;
        while(temp!= null)
        {
            if(temp_head == null)
            {
                ListNode newnode = new ListNode(temp.val,null);
                temp_head = newnode;
                temp = temp.next;
            }
            else
            {
                ListNode newnode = new ListNode(temp.val,temp_head);
                temp_head = newnode;
                temp = temp.next;
            }
        }
        return temp_head;
    }
}
