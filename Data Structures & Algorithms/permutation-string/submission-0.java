class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s2.length() < s1.length()) return false;

        Map<Character , Integer> map1 = new HashMap<>();
        Map<Character , Integer> map2 = new HashMap<>();

        for(int i = 0 ; i<s1.length() ; i++){
            map1.put(s1.charAt(i) , map1.getOrDefault(s1.charAt(i),0)+1);
        }

        int l = 0;
        for(int r = 0 ; r < s2.length() ; r++){
            
            char rc = s2.charAt(r);
            int maxsize = s1.length();
            int window_size = (r-l)+1;
            map2.put(rc , map2.getOrDefault(rc,0)+1);
            if(window_size > maxsize){
                char lc = s2.charAt(l);
                map2.put(lc , map2.get(lc)-1);
                if(map2.get(lc) == 0){
                    map2.remove(lc);
                }
                l++;
            }
            
            if(map2.equals(map1)) return true;
        }
        return false;
    }
}
