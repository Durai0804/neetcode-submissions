class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        Map<Integer , Integer> map = new HashMap<>();

        for(int i =0;i<n;i++){
            int bal = target - nums[i];
            if(map.containsKey(bal)){
                return new int[]{map.get(bal) , i};
            }else{
                map.put(nums[i] , i);
            }
        }
        return new int[]{};
        
    }
}
