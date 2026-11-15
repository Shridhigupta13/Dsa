class Solution {
    public int numOfSubarrays(int[] arr) {
        int ans = 0;
        int evenC =1;
        int oddC = 0;
        int sum = 0;
        for(int x : arr){
            sum += x;
            if(sum % 2 == 0){
                ans += oddC;
                evenC++;
            }else{
                ans += evenC;
                oddC++;
            }
            ans = ans % 1000000007;
        }
        return ans;
    }
}