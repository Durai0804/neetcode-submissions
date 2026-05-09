class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }

        int longest = 0;

        for(int num : set){
            if(!set.contains(num-1)){
                int len = 1;
                int curr = 1;
                while(set.contains(num + curr)){
                    len++;
                    curr = curr +1;
                }
                longest = Math.max(len , longest);
                
            }
            
        }
        
        return longest;
    }
}
