class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.get(target-nums[i]) != null ){
                int ri=map.get(target-nums[i]);
                if(i<ri)
                return new int[]{i,ri};
                else return new int[]{ri,i};
            }else{
                map.put(nums[i],i);
            }
        }
        return new int[]{0,1};
    }
}
