class Solution {
    int mod = 1_000_000_007;

    int solve(int[][] grid, int k, int i, int j, int rem, int[][][] dp) {

        int m = grid.length;
        int n = grid[0].length;

        if (i >= m || j >= n)
            return 0;

        rem = (rem + grid[i][j]) % k;

        if (i == m - 1 && j == n - 1) {
            if (rem == 0)
                return 1;
            return 0;
        }

        if (dp[i][j][rem] != -1)
            return dp[i][j][rem];

        int right = solve(grid, k, i, j + 1, rem, dp);
        int down = solve(grid, k, i + 1, j, rem, dp);

        return dp[i][j][rem] = (right + down) % mod;
    }

    public int numberOfPaths(int[][] grid, int k) {

        int m = grid.length;
        int n = grid[0].length;

        int[][][] dp = new int[m][n][k];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                Arrays.fill(dp[i][j], -1);
            }
        }

        return solve(grid, k, 0, 0, 0, dp);
    }
}