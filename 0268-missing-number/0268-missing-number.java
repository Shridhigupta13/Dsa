class Solution {
    public int missingNumber(int[] nums) {
        long n = nums.length;
        long totalSum = n*(n+1)/2;
        long arraySum = 0;
        for(int ele : nums){
            arraySum += ele;
        }
        return (int)(totalSum - arraySum);
    }
}