class Solution {
    public String minWindow(String s, String t) {
        int l =0;
        int beg =-1;
        int e = 10000000;
        int mapped =0;
        HashMap<Character,Integer> map = new HashMap<>();
        HashMap<Character,Integer> mapS = new HashMap<>();
        for(int i =0;i<t.length();i++){
            char ch =t.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        // System.out.println(map);
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                mapS.put(ch,mapS.getOrDefault(ch,0)+1);
                if((int) map.get(ch)==(int) mapS.get(ch))mapped++;
               
            }
            // System.out.println(mapS);
             while(l<=i && mapped == map.size()){
                // System.out.println("entered");
                int len = i-l+1;
                if(beg==-1 || len<e-beg+1){
                    beg=l;
                    e =i;
                }
                char c =s.charAt(l);
                if(mapS.containsKey(c)){
                   if((int) map.get(c)==(int) mapS.get(c)) mapped--;
                    mapS.put(c,mapS.get(c)-1);
                    if(mapS.get(c)==0)mapS.remove(c);
                } 
                l++;
            }
        }
        if(beg==-1)return "";
        return s.substring(beg,e+1);
    }
}