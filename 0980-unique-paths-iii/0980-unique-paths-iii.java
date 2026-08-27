class Solution {
    public int uniquePathsIII(int[][] grid) {
        int total0 = 0;
        int sr= 0;
        int sc = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 0) {
                    total0++;
                } else if (grid[i][j] == 1) {
                    sr = i;
                    sc = j;
                }
            }
        }
        return helper(grid, sr, sc, total0, 0);
    }

    public int helper(int[][] grid, int sr, int sc, int totalZeros, int currentZeros) {
        if (sr < 0 || sr >= grid.length || sc < 0 || sc >= grid[0].length || grid[sr][sc] == -1) {
            return 0;
        }
        if (grid[sr][sc] == 2) {
            if (totalZeros == currentZeros-1) return 1;
            else return 0;
        }
        grid[sr][sc] = -1;
        int down = helper(grid, sr + 1, sc, totalZeros, currentZeros + 1);
        int up = helper(grid, sr - 1, sc, totalZeros, currentZeros + 1);
        int right = helper(grid, sr, sc + 1, totalZeros, currentZeros + 1);
        int left = helper(grid, sr, sc - 1, totalZeros, currentZeros + 1);
        int totalPaths = down + up + right + left;
        
        grid[sr][sc] = 0;

        return totalPaths;
    }
}