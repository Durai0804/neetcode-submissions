class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character , Integer> map = new HashMap<>();
        int l=0;
        int maxlen = 0;
        int maxfreq = 0;

        for(int r=0;r<s.length();r++){
            char rc = s.charAt(r);
            
            map.put(rc , map.getOrDefault(rc,0)+1);
            int freq = map.get(rc);
            maxfreq = Math.max(freq , maxfreq);
            int window_size = (r-l)+1;

            while((r-l)+1 - maxfreq > k){
                char lc = s.charAt(l);
                map.put(lc , map.get(lc)-1);
                l++;
            }
            
            
            maxlen = Math.max(maxlen , (r-l)+1);
            
        }
        return maxlen;
    }
}
