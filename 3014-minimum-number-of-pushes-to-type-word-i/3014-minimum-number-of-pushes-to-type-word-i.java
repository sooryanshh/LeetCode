class Solution {
    public int minimumPushes(String word) {
        int push = 0, min=1;
        int a = word.length();
        while(a>0){
          if(a>=8)
          push+=min*8;
          else push+=min*a;
          min++;
          a-=8;
        }
        return push;

    }
}