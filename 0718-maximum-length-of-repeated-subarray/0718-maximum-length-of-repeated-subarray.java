class Solution {
    public int findLength(int[] nums1, int[] nums2) {
       HashMap<Integer,List<Integer>> map = new HashMap<>();
       int ans =0;
      for(int i =0;i<nums2.length;i++){
        if(map.containsKey(nums2[i])){
            map.get(nums2[i]).add(i);
        }
        else {
            List<Integer> list = new  ArrayList<>();
            list.add(i);
            map.put(nums2[i],list);
        }
      }
    //   System.out.println(map);
      for(int i =0;i<nums1.length;i++){
        if(map.containsKey(nums1[i])){
            List<Integer> list = map.get(nums1[i]);
            for(int n:list){
                int count =0;
                // System.out.println("n" +" = "+n);
                for(int j =i;j<nums1.length && n<nums2.length;j++,n++){
                    if(nums1[j]!=nums2[n])break;
                    else count++;                       
                    
                }
                // System.out.println("count"+ count);
                // System.out.println("------");
                ans =Math.max(ans,count);
            }

        }
      }
    return ans;
    }
}