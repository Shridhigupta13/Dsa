class Solution {
    public int maximumCount(int[] nums) {
        int n = nums.length;
        int lo =0;
        int hi = n-1;
        int posinteger = n;
        int neginteger =n;

         while(lo <= hi){
            int mid = (lo+hi)/2;
            if(nums[mid] >= 0){
                posinteger = mid;
                hi = mid -1;
            }
            else{
                lo = mid +1;
            }
         }

         lo =0;
         hi = n-1;
         while(lo <= hi){
            int mid = (lo+hi)/2;
            if(nums[mid] > 0){
                neginteger = mid;
                hi = mid -1;
            }
            else{
                lo = mid +1;
            }
         }
         return Math.max(posinteger, n-neginteger);
    }
}