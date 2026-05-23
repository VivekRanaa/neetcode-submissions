class Solution {
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
    List<Integer> left = new ArrayList<>();
    List<Integer> right = new ArrayList<>();
    for(int i=0;i<nums.length-1;i++){
        left.add(nums[i]);
    }
    for(int i=1;i<nums.length;i++){
        right.add(nums[i]);
    }
    return Math.max(robPart(left),robPart(right));
    }
    
    public int robPart(List<Integer>temp){
        int [] dp = new int[temp.size()];
        dp[0] = temp.get(0);
        for(int i=1;i<temp.size();i++){
            int pick = temp.get(i);
            if(i>1) pick+= dp[i-2];
            int notPick = dp[i-1];
            dp[i] = Math.max(pick,notPick);
        }
        return dp[temp.size()-1];
    }
}
