class Solution {
    public int solve(int i , String s, int[] dp){
       if(i>=s.length())  return 1;
       if(s.charAt(i)=='0')   return 0;
       if(dp[i] != 0) return dp[i];

       int single = solve(i+1,s,dp);

       int twoNumber = 0;
       if(i<s.length()-1){
         int curr = s.charAt(i) - 48;
         int next = s.charAt(i+1) - 48;

         int nums = curr*10 + next;
      
       if(nums<=26){
        twoNumber = solve(i+2,s,dp);
       }
    }
    return dp[i] = single + twoNumber;

    }
    
    public int numDecodings(String s) {
        int n = s.length();
        int[] dp = new int[n];
        return solve(0, s,dp);
    }
}