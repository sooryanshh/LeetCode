class Solution {
    int ans = 0;
    public int totalNumbers(int[] digits) {
        Set<List<Integer>> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        helper(digits,list,0,set);
        return ans;
    }
    public void helper(int[] digits,List<Integer> list,int s,Set<List<Integer>> set){
        if(list.size()==1 && list.get(0)==0)return;
        if(list.size()==3){
            if(!set.contains(list) && list.get(list.size()-1)%2==0){
                ans++;
                set.add(new ArrayList<>(list));
            }
            return;
        }
        for(int i =s;i<digits.length;i++){            
            swap(digits,i,s);
            list.add(digits[s]);
            helper(digits,list,s+1,set);
            swap(digits,i,s);
            list.remove(list.size()-1);
        }
    }
    public void swap(int[] digits,int i,int j){
        int temp = digits[i];
        digits[i]=digits[j];
        digits[j] = temp;
    }
}