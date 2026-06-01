class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int res = Integer.MAX_VALUE;

        int max = 0;
        for(int num : piles){
            max = Math.max(max,num);
            
        }
        

        int r = max , l = 1;
        while(l<=r){
            int ans = 0;
            int mid = l + (r-l)/2 ;
            for(int num : piles){
                ans = ans + (num + mid -1)/mid;
            }
            if(ans<=h){
                 res = Math.min(mid , res);
                 r = mid-1;
            }
            else{
                ans =0;
                l = mid+1;
            }

            
        }
        return res;
        
    }
}
