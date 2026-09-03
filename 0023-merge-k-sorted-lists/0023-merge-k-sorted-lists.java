class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0)return null;
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b) -> a.val!=b.val ? a.val-b.val : b.val-a.val);
        for(int i =0;i<lists.length;i++){
            ListNode temp = lists[i];
            if(temp==null)continue;
            while(temp!=null){
                pq.add(temp);
                temp = temp.next;
                
            }
        }
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
       while(!pq.isEmpty()){
        ListNode t = pq.poll();
        temp.next = t;
        temp = temp.next;
        temp.next = null;
       }
       return dummy.next;
    }
}