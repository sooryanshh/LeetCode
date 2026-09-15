class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        int n = strs.length;
        String[] s = new String[n];
        for(int i =0;i<strs.length;i++){
           char[] temp = strs[i].toCharArray();
           Arrays.sort(temp);
           s[i]= new String(temp);  
           
        }
        
        HashMap<String,List<String>> map = new HashMap<>();
        for(int i = 0;i<n;i++){
            if(!map.containsKey(s[i])){
                map.put(s[i],new ArrayList<>());
            }
            map.get(s[i]).add(strs[i]);
        }
         for(String key : map.keySet()){
            ans.add(new ArrayList<>(map.get(key)));
         }
         return ans;
    }
}