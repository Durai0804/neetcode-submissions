class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> res = new ArrayList<>();

        for(int[] interval : intervals){

            //1st : check newinterval comes before curr interval
            if(newInterval == null || interval[1] < newInterval[0]){
                res.add(interval);
            }
            //2nd : Check newInterval comes after curr interval
            else if( interval[0] > newInterval[1]){
                res.add(newInterval);
                res.add(interval);
                newInterval = null;
            }
            //3rd : if new interval[1] == curr interval[0] overlap found 
            else{
                newInterval[0] = Math.min(interval[0] , newInterval[0]);
                newInterval[1] = Math.max(interval[1] , newInterval[1]);
            }
        }
        if(newInterval != null) res.add(newInterval);
        return res.toArray(new int[res.size()][]);
        
    }
}
