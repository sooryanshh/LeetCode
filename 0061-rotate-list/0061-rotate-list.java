class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        int n =0;
        ListNode temp = head;
        while(temp !=null){
            n++;
            temp = temp.next;
        }
        if(n==0 || n==1)return head;
        k=k%n;
        if(k==0)return head;
        temp = head;
        for(int i =1;i<n-k;i++){
            temp =temp.next;
        }
        ListNode curr = temp.next;
        temp.next = null;
        temp = curr;
        while(temp!=null &&temp.next!=null){
            temp = temp.next;
        }
        temp.next = head;
        return curr;


        
    }
}