class Solution {
    public int maxArea(int[] heights) {
        int max = 0;
        int i=0;
        int j=heights.length-1;
        while(i<j){
            int length = j-i;
            int breadth;
            if(heights[i]<=heights[j]) breadth=heights[i];
            else breadth=heights[j];
            int area = length*breadth;
            max = Math.max(area,max);
            if(heights[i]<=heights[j]) i++;
            else j--;

        }
        return max;
    }
}
