class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        //copy the array
        int[] arr = new int [n];
        for(int i=0; i<n; i++){
            arr[i] = nums[i];
        }
        //fill n-k element in nums
        int idx = 0;
        for(int i=n-k; i<n; i++){
            nums[idx++] = nums[i];
        }
        //fill the rest part of nums using copy array
        for(int i=0; i<n-k; i++){
            nums[idx++] = arr[i];
        }
    }
}