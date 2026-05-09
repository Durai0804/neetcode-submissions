class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        int n = temperatures.length;
        int[] res = new int[n];

        for(int i = 0 ;i<n;i++){
            for(int j=0;j<n;j++){
                if(i!=j){
                    if(temperatures[i] < temperatures[j] && i<j){
                        res[i] = j-i;
                        break;
                    }
                }else{
                    continue;
                }
            }

        }
        return res;
        
    }
}
