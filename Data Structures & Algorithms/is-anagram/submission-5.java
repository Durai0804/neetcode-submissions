class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) return false;

        HashMap<Character,Integer> chars = new HashMap<>();
        HashMap<Character,Integer> chart = new HashMap<>();

        for(int i=0;i<s.length();i++){
            chars.put(s.charAt(i) , chars.getOrDefault(s.charAt(i),0)+1);
            chart.put(t.charAt(i) , chart.getOrDefault(t.charAt(i),0)+1);
        }
        return chars.equals(chart);

    }
}
