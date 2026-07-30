class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        solve(res,subset,nums,0);
        return res;

    }
    public static void solve(List<List<Integer>> res, List<Integer> subset, int[] nums,int index){

        if(index == nums.length){
            res.add(new ArrayList<>(subset));
            return;
        }

        subset.add(nums[index]);
        solve(res,subset,nums,index+1);
        subset.remove(subset.size()-1);
        solve(res,subset,nums,index+1);
    }
}
