
class Solution {
    static final long MOD = 1_000_000_007L;

    public int maxProductPath(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        long[][] maxDP = new long[m][n];
        long[][] minDP = new long[m][n];
        boolean[][] visited = new boolean[m][n];

        solve(grid, m, n, 0, 0, maxDP, minDP, visited);

        long ans = maxDP[0][0];

        if (ans < 0) {
            return -1;
        }

        return (int) (ans % MOD);
    }

    private void solve(int[][] grid, int m, int n,
                       int r, int c,
                       long[][] maxDP, long[][] minDP,
                       boolean[][] visited) {

        if (visited[r][c]) {
            return;
        }

        if (r == m - 1 && c == n - 1) {
            maxDP[r][c] = grid[r][c];
            minDP[r][c] = grid[r][c];
            visited[r][c] = true;
            return;
        }

        long max = Long.MIN_VALUE;
        long min = Long.MAX_VALUE;

        if (r + 1 < m) {
            solve(grid, m, n, r + 1, c, maxDP, minDP, visited);

            long a = maxDP[r + 1][c] * grid[r][c];
            long b = minDP[r + 1][c] * grid[r][c];

            max = Math.max(max, Math.max(a, b));
            min = Math.min(min, Math.min(a, b));
        }

        if (c + 1 < n) {
            solve(grid, m, n, r, c + 1, maxDP, minDP, visited);

            long a = maxDP[r][c + 1] * grid[r][c];
            long b = minDP[r][c + 1] * grid[r][c];

            max = Math.max(max, Math.max(a, b));
            min = Math.min(min, Math.min(a, b));
        }

        maxDP[r][c] = max;
        minDP[r][c] = min;
        visited[r][c] = true;
    }
}
