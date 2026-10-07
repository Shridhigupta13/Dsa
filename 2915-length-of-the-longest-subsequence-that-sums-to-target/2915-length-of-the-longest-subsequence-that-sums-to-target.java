class Solution {
    int solve(List<Integer> nums, int target, int i, int n, int[][] dp) {
        if (target == 0)
            return 0;
        if (target < 0 || i >= n)
            return -100000;
        if (dp[i][target] != -1)
            return dp[i][target];

        int take = 1 + solve(nums, target - nums.get(i), i + 1, n, dp);
        int skip = solve(nums, target, i + 1, n, dp);

        return dp[i][target] = Math.max(take, skip);

    }

    public int lengthOfLongestSubsequence(List<Integer> nums, int target) {
        int n = nums.size();
        int[][] dp = new int[n][target + 1];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }

        int ans = solve(nums,target,0,n,dp);

        return ans > 0 ? ans : -1;
    }
}