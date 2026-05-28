class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int l = 0 ; int r = 0;
        int maxlen = 0;
        while(r<s.length()){
            if(!set.contains(s.charAt(r))){
                set.add(s.charAt(r));
                int len = (r-l)+1;
                maxlen = Math.max(maxlen , len);
                r++;
            }else{
                while(set.contains(s.charAt(r))){
                    set.remove(s.charAt(l));
                    l++;
                }
            }
        }
        return maxlen;
        
    }
}
