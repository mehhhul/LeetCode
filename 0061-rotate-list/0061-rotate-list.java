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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null) return null;
        int length = 0;
        ListNode curr = head;
        while (curr != null) {
            length++;
            curr = curr.next;
        }
        k=k%length;
            ListNode help = head;
        while(k>0){
            ListNode first = help;
            while(first.next.next!=null){
                first=first.next;
            }
            first.next.next = help;
            help = first.next;
            first.next = null;
            k--;
        }
        return help;
    }
}