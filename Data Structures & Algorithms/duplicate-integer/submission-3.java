class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int l = 0;
        for(int r = 1 ; r<n; r++){
            if(nums[l] != nums[r] && l!=r){
                l++;
                continue;
            }else{
                return true;
            }
        }
        return false;
    }
}