class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int area = 0;

        int l = 0 , r = n-1;
        while(l<r){
            int curr_area = Math.min(heights[l] , heights[r]) * (r-l);
            area = Math.max(curr_area,area);
            if(heights[l] < heights[r]){
                l++;

            }else{
                r--;
            }
        }
        return area;
        
    }
}
