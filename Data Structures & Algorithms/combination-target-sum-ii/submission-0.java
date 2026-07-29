class Solution {
   public List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        //  List<List<Integer>> res = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        solve(candidates,target,subset,0);
        return res;
        
    }

    public void solve(int[] nums , int target ,List<Integer> subset,int index){
        if(target == 0){
            res.add(new ArrayList<>(subset));
            return;
        }

        if(target < 0 || index >= nums.length){
            return;
        }

        subset.add(nums[index]);
        solve(nums,target-nums[index],subset,index+1);
        subset.remove(subset.size()-1);
        while(index+1 < nums.length && nums[index] == nums[index+1]) index++;
        solve(nums,target,subset,index+1);
    }
}
