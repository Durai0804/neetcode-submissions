class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;

        int l = 0 ;
        int r = row*col -1;
        while(l<=r){
            int mid = l+(r-l)/2;
            int ro = mid/col;
            int c = mid%col;

            if(matrix[ro][c] == target){
                return true;
            }else if(matrix[ro][c] < target){
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        return false;
        
    }
}
