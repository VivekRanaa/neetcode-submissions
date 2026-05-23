class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int i:nums) sum+=i;
        if(sum%2!=0) return false;
        return subsetSum(nums,sum/2) == 1 ? true : false;
    }
    public int subsetSum(int [] nums,int target){
        int m=nums.length;
        int n=target;
        int[][] dp= new int[m][n+1];
        for(int i=0;i<m;i++) dp[i][0] = 1;
        dp[0][nums[0]] = 1;
        for(int i=1;i<m;i++){
            for(int j=1;j<=n;j++){
                int notTake = dp[i-1][j];
                int take = 0;
                if(nums[i]<=j) take = dp[i-1][j-nums[i]];
                if(take==1 ||notTake==1) dp[i][j] = 1;
                else dp[i][j] = 0;
            }
        }
        return dp[m-1][n];
    }
}
