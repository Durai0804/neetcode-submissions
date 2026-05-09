class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int n = nums.length;
        int longest = 0;

        for(int num : nums){
            set.add(num);
        }
        

        for(int num : nums){
            if(!set.contains(num-1)){
                int len = 1 , curr = 1;
                while(set.contains(num+curr)){
                    len++;
                    curr++;
                }
                longest = Math.max(len,longest);
            }
            
        }
        return longest;
    }
}
