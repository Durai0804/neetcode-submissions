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
        int size = 0;
        
        ListNode point = head;
        while(point != null){
            point = point.next;
            size++;
        }
        int count = size - n;
        ListNode temp = head;
        ListNode prev = null;
        if(count == 0){
            return head.next;
        }
        while(count >=0){
            if(count != 0){
                prev = temp;
                temp = temp.next;
                count--;
            }else{
                ListNode next = temp.next;
                prev.next = next;
                temp.next = null;
                break;
            }
        }
return head;
        

    }
}
