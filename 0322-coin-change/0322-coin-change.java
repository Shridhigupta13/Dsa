class Solution {
    public int solution(int amount, int[] coins,int[] dp) {
        if (amount == 0) return 0;
        if (amount < 0) return Integer.MAX_VALUE;
        if(dp[amount] != -1) return dp[amount];

        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < coins.length; i++) {
            int result = solution(amount - coins[i], coins,dp);

            if (result != Integer.MAX_VALUE) {
                ans = Math.min(ans, result + 1);
            }
        }
        return dp[amount] = ans;
    }

    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        Arrays.fill(dp,-1);
        int ans = solution(amount, coins,dp);
        if (ans == Integer.MAX_VALUE)
            return -1;

        return ans;

    }
}