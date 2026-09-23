class Solution {
    public int longestIncreasingPath(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int maxPath = 0;
        int dp[][]=new int[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(dp[i],-1);
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                maxPath = Math.max(maxPath, solve(matrix, i, j, m, n,dp));
            }
        }
        return maxPath;
    }

    int solve(int matrix[][], int row, int col, int m, int n,int dp[][]) {
        if (row >= m || col >= n || row < 0 || col < 0)
            return 0;
        if(dp[row][col]!=-1) return dp[row][col];
        int up = 0;
        if (row - 1 >=0 && matrix[row][col] < matrix[row - 1][col])
            up = solve(matrix, row - 1, col, m, n,dp);
        int down = 0;
        if (row + 1 < m && matrix[row][col] < matrix[row + 1][col])
            down = solve(matrix, row + 1, col, m, n,dp);
        int left = 0;
        if (col - 1 >=0 && matrix[row][col] < matrix[row][col - 1])
            left = solve(matrix, row, col - 1, m, n,dp);
        int right = 0;
        if (col + 1 < n && matrix[row][col] < matrix[row][col + 1])
            right = solve(matrix, row, col + 1, m, n,dp);
        
        dp[row][col]= 1 + Math.max(Math.max(up, down), Math.max(left, right));
        return dp[row][col];
    }
}