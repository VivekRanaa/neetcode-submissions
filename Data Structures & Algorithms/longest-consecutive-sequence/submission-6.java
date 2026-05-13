class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        Set<Integer> set = new HashSet<>();
        for(int i:nums) set.add(i);
        int ml = 0;
      
        for(int i:nums){
          if(!set.contains(i-1)){
            int l = 1;
            int cur = i;
            while(set.contains(cur+1)){
                cur++;
                l++;
            }
            ml = Math.max(l,ml);
          }
         
        }
        return ml;
    }
}
