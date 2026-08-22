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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next ==null || head.next.next ==null)return head ;
        ListNode odd=head;
        ListNode even = new ListNode(0);
        ListNode temp = even;
        while(head!=null && head.next!=null){
           temp.next = head.next;
           temp= temp.next;
           if(temp!=null){
           head.next = temp.next;
           head = head.next;}
           else head.next = null;
        }
        if(temp.next !=null)temp.next = null;
        ListNode ptr = odd;
        while(ptr!=null && ptr.next !=null){
            ptr = ptr.next;
        }
        ptr.next= even.next;
        return odd;


    }
}