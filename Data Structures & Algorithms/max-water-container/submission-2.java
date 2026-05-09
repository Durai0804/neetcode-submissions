class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int l = 0 , r = n-1;
        int max_area = 0;
        while(l<r){
            int area = (Math.min(heights[l],heights[r])) * (r-l);
            if(heights[l] < heights[r]) l++;
            else r--;

            max_area = Math.max(area , max_area);


        }
        return max_area;
        
    }
}
