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
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> set = new HashSet<>();
        for(int i =0;i<nums.length;i++){
            set.add(nums[i]);
        }
        ListNode temp = head;
        ListNode dummy = new ListNode(0);
        ListNode prev = dummy;
        dummy.next = head;
        while(temp!=null){
            if(set.contains(temp.val)){
                prev.next = temp.next;

            }else {
                prev = prev.next;
            }
            temp= temp.next;
        }
        return dummy.next;

    }
    
    
}