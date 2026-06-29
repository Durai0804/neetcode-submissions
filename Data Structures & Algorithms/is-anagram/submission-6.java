class Solution {
    public boolean isAnagram(String S, String T) {
        Map<Character,Integer> schar = new HashMap<>();
        Map<Character,Integer> tchar = new HashMap<>();
        if(S.length() != T.length()) return false;

        for(int i=0;i<S.length();i++){
            char s = S.charAt(i);
            char t = T.charAt(i);

            schar.put(s,schar.getOrDefault(s,0)+1);
            tchar.put(t,tchar.getOrDefault(t,0)+1);
        }

        if(schar.equals(tchar)) return true;
        else return false;

    }
}
