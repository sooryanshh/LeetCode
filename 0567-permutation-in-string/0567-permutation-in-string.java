class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int k =s1.length();
        if(s1.length()>s2.length())return false;
   HashMap<Character,Integer> map =new HashMap<>();
  for(char ch: s1.toCharArray() ){
    map.put(ch,map.getOrDefault(ch,0)+1);
  }
  HashMap<Character,Integer> mp =new HashMap<>();
  for(int i =0;i<k;i++){
    char ch  =s2.charAt(i);
    mp.put(ch,mp.getOrDefault(ch,0)+1);
  }
  if(map.equals(mp))return true;
  int j =0;
  for(int i = k;i<s2.length();i++){
    char ch = s2.charAt(i);
    
    mp.put(ch,mp.getOrDefault(ch,0)+1);
    mp.put(s2.charAt(j),mp.get(s2.charAt(j))-1);
    if(mp.get(s2.charAt(j))==0)mp.remove(s2.charAt(j));
    j++;
    if(mp.equals(map))return true;
      }
  return false;
    }
}