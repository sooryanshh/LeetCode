class Solution {
    public boolean uniformArray(int[] nums) {
       boolean odd = true;
       boolean even = true ;
       Arrays.sort(nums);
       boolean flag = true;;
       int j = -1;
       for(int i =0;i<nums.length;i++){
        if(nums[i]%2!=0 && flag){
            j=i;
            flag = false;
        }
        else {
            if(j==-1){
                odd = false;
                break;
            }
        }
       }
       for(int i =0;i<nums.length;i++){
          if(nums[i]%2!=0){
            even = false ;
            break;
          }
       }
        return odd || even;
    }
}