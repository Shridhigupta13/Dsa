class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] sum = new int[n];

        int leftSum = 0;
        int rightSum = 0;
        
        for (int i = 0; i < n; i++) {
            rightSum += nums[i];
        }
        for (int i = 0; i < n; i++) {
            rightSum -= nums[i];

            sum[i] = Math.abs(leftSum - rightSum);

            leftSum += nums[i];
        }

        return sum;
    }
}