class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int strow=0, stcol=0;
        int endrow = n-1,endcol = n-1;
        int count = 1;
        while(count<=n*n){
            for(int i = strow;i<=endcol;i++){
                matrix[strow][i]=count;
                count++;
            }
            strow++;
            for(int i = strow;i<=endcol;i++){
                matrix[i][endcol] = count;
                count++;
            }
            endcol--;
            for(int i = endcol;i>=stcol;i--){
            matrix[endrow][i] = count;
            count++;
            }
            endrow--;
            for(int i = endrow;i>=strow;i--){
                matrix[i][stcol] = count;
                count++;
            }
            stcol++;
        }
        return matrix;
    }
}