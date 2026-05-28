class Solution {
    public int trap(int[] height) {
        if(height.length == 1 || height.length == 0) return 0;

        int l=0 , r=height.length-1;
        int Lmax = height[0];
        int Rmax = height[r];
        int res = 0;

        while(l<r){
            if(height[l] < height[r]){
                l++;
                Lmax = Math.max(Lmax , height[l]);
                res += Lmax - height[l];
            }else{
                r--;
                Rmax = Math.max(Rmax, height[r]);
                res += Rmax - height[r];
            }
        }
        return res;
        
    }
}
