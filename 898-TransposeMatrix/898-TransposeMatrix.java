// Last updated: 8/11/2026, 11:24:28 AM
class Solution {
    public int[][] transpose(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int trans[][]=new int[n][m];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                trans[j][i]=matrix[i][j];
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                //System.out.print(matrix[i][j]);
            }
        }
        return trans;
        
    }
}