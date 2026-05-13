class Solution {
    public int trap(int[] height) {
    int[] prefixGreater = new int[height.length]; 
    int[] suffixGreater = new int[height.length];
    int leftMax=0;
    int rightMax=0;
    int area=0;
    for(int i=1;i<height.length;i++){
        prefixGreater[i]= Math.max(leftMax,height[i-1]);
        leftMax = prefixGreater[i];
    }
    for(int i=height.length-2;i>=0;i--){
        suffixGreater[i]= Math.max(rightMax,height[i+1]);
        rightMax = suffixGreater[i];
    }
    for(int i=0;i<height.length;i++){
        area+=Math.max(Math.min(prefixGreater[i], suffixGreater[i]) - height[i],0);
    }
    return area;
}
}