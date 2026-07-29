class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        solve(res,subset,0,nums,target);
        return res;

        
    }
    public static void solve(List<List<Integer>> res , List<Integer> subset , int index , int[] nums , int target){
            if(target == 0){
                res.add(new ArrayList<>(subset));
                return;
            }

            if(target<0 || index >= nums.length){
                return;
            }

            subset.add(nums[index]);
            solve(res,subset,index,nums,target-nums[index]);

            subset.remove(subset.size()-1);
            solve(res,subset,index+1,nums,target);
    }
}
