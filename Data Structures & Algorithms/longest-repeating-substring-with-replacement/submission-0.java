class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character , Integer> map = new HashMap<>(); //map for storing count of characters
        int res = 0; // result
        int maxf = 0; // maximum frequency of elemets in window
        int l = 0 ;
        for(int r = 0 ; r<s.length();r++){
            map.put(s.charAt(r) , map.getOrDefault(s.charAt(r),0)+1);

            maxf = Math.max(maxf , map.get(s.charAt(r)));
            // to check valid or not
            while((r-l+1) - maxf > k){
                map.put(s.charAt(l) , map.get(s.charAt(l))-1);
                l++;
        }

        res = Math.max(res , (r-l)+1);


        
    }
    return res;
    }

}
