class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        solve(res,subset,0,target,nums);
        return res;
        
    }
    public static void solve(List<List<Integer>>res , List<Integer> subset , int index , int target,int[] nums){
        if(target == 0){
            res.add(new ArrayList<>(subset));
            return;
        }

        if(target <0 || index == nums.length){
            return;
        }

        subset.add(nums[index]);
        solve(res,subset,index,target-nums[index],nums);
        subset.remove(subset.size()-1);
        solve(res,subset,index+1,target,nums);
    }
}
