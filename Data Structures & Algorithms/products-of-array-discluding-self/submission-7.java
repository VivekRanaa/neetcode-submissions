class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] temp = new int[nums.length];
        int[] tempr = new int[nums.length];
        int[] result = new int[nums.length];
        for(int i=0;i<temp.length;i++){
            temp[i] =1;
            tempr[i] = 1;
        }
        temp[1] = nums[0];
        tempr[nums.length-2] = nums[nums.length-1];
        for(int i=2;i<nums.length;i++){
            temp[i] = nums[i-1]*temp[i-1];
        }
        for(int i=nums.length-3;i>=0;i--){
            tempr[i] = nums[i+1]*tempr[i+1];
        }
         for(int i=0;i<result.length;i++){
           result[i] = temp[i]*tempr[i];
        }
        return result;
    }
}  
