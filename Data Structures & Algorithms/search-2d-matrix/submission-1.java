class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int ro = matrix.length;
        int c = matrix[0].length;

        int l=0;
        int r=ro*c-1;

        while(l<=r){
            int mid = l+(r-l)/2;
            int row = mid / c;
            int col = mid % c;

            if(target == matrix[row][col]){
                return true;
            }else if(target > matrix[row][col]){
                l = mid+1;
            }else if(target < matrix[row][col]){
                r = mid-1;
            }
        }
        return false;
        
    }
}
