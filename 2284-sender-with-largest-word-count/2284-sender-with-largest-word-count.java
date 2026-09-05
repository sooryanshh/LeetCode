class Solution {
    public String largestWordCount(String[] messages, String[] senders) {
        HashMap<String,Integer> map = new HashMap<>();
        int i = 0;
        for(String s : senders){
            map.put(s,map.getOrDefault(s,0)+messages[i++].split(" ").length);
        }
        String ans = "";
        int max = Integer.MIN_VALUE;
        for(String s: map.keySet()){
            int n = map.get(s);
            if(n>max){
                max = n;
                ans =s;
            }
            else if(n==max){
                ans = ans.compareTo(s)<0 ? s:ans ;
            }
        }
        return ans;
    }
}