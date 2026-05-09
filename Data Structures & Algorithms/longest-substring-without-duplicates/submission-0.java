class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] ch = s.toCharArray();
        int n = ch.length;
        int l = 0 , r =0;
        Set<Character> set = new HashSet<>();
        int max = 0;

        while(r<n){
            
            if(!set.contains(ch[r])){
                set.add(ch[r]);
                int len = r-l+1;
                max  = Math.max(len , max);
                r++;
            }else{
                
                while(set.contains(ch[r])){
                    set.remove(ch[l]);
                    l++;
                    
                }
              }
        }
        return max;
    }
}
