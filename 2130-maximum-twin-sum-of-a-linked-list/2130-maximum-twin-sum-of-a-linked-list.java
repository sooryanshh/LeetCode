class Solution {
    public int pairSum(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next =head;
        ListNode slow = dummy;
        ListNode fast = head ;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
       ListNode tempHead = slow.next;
       slow.next =null;
        ListNode prev = null;
        slow = tempHead;
        while(slow!=null){
            ListNode temp = slow.next;
            slow.next =prev ;
            prev = slow;
            slow = temp;
        }
        tempHead = prev;
        int max = tempHead.val+head.val;
        while(tempHead!=null && head!=null){
            if(tempHead.val+head.val>max){
                max = tempHead.val+head.val;
            }
            head = head.next ;
            tempHead = tempHead.next;
        }
        return max;
    }
}