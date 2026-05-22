class Solution {
    public int minCostClimbingStairs(int[] cost) {
    List<Integer> costList = new ArrayList<>();
    for(int i:cost) costList.add(i);
    costList.add(0);
    for(int i=costList.size()-3;i>=0;i--){
        costList.set(i,Math.min(costList.get(i+1)+costList.get(i),costList.get(i)+costList.get(i+2)));
    }
    return Math.min(costList.get(0),costList.get(1));
    }
}
