class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int sn= s.length();
        int pn = p.length();
        List<Integer> list = new ArrayList<>();
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : p.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        HashMap<Character,Integer> mp = new HashMap<>();
        int l =0;
        for(int i =0;i<sn;i++){
            
            char ch = s.charAt(i);
            mp.put(ch,mp.getOrDefault(ch,0)+1);
            if(i-l+1==pn){
                if(mp.equals(map))list.add(l);
                 char lch= s.charAt(l);
                mp.put(lch,mp.get(lch)-1);
                if(mp.get(lch)==0)mp.remove(lch);
                l++;
               
            }
        }
        
        return list;
    }
}