class Solution {
    public int minimumPushes(String word) {
        int[] map = new int[26];
        for(char c : word.toCharArray()){
           map[c-'a']++;
        }
        Arrays.sort(map);
        int ans =0;
        int key=1;
        for(int i=25;i>=0;i--){
           if(key<=8)ans+=map[i]*1;
           else if(key<=16)ans+=map[i]*2;
           else if(key<=24)ans+= map[i]*3;
           else ans+=map[i]*4;
           key++;
        }
        return ans;

    }
}