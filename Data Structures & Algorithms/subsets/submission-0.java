class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();

        solve(nums,res,subset,0);
        return res;
        
    }
    public static void solve(int[] nums , List<List<Integer>> res , List<Integer> subset , int index){
        if(index == nums.length){
            res.add(new ArrayList<>(subset));
            return;
        }

        subset.add(nums[index]);
        solve(nums,res,subset,index+1);

        subset.remove(subset.size()-1);
        solve(nums,res,subset,index+1);
    }
}
