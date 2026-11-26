import java.util.Arrays;
class Solution {
    public int minimizeSum(int[] nums) {

        Arrays.sort(nums);
        int n = nums.length;

        int firstP = Math.abs(nums[n-3] - nums[0]);
        int secondP = Math.abs(nums[n-1] - nums[2]);
        int lastP = Math.abs(nums[n-2] - nums[1]);
        
        return Math.min(Math.min(firstP, secondP), lastP);
    }
}