class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int a[][]=new int[m][n];
        for(int i=0;i<indices.length;i++){
            int row=indices[i][0];
            int col=indices[i][1];
            for(int j=0;j<n;j++){
                a[row][j]++;
            }
            for(int k=0;k<m;k++){
                a[k][col]++;
            }
        }
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(a[i][j]%2!=0){
                    count++;
                }
            }
        }
        return count++;
    }
}