class Solution {
        public long helper(int i, int[] coins, int amount,long[][] dp){
        if (i == coins.length){
            if(amount == 0) return 1;
            else return 0;
        }
        if(dp[i][amount]!= -1) return dp[i][amount];
        long skip = helper(i+1,coins,amount,dp);
        if(amount-coins[i] < 0) return dp[i][amount] = skip;
        long pick = helper(i,coins,amount-coins[i],dp);
        return dp[i][amount] = skip + pick;
    }
    public int change(int amount, int[] coins) {
        long[][] dp = new long[coins.length][amount+1];
        for(int i=0;i<dp.length;i++) Arrays.fill(dp[i],-1);
        int ans = (int) helper(0,coins,amount,dp);
        return ans;
    }
}